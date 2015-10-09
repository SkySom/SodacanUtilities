package com.thedoctorsoda.sodacantorches.items;

import com.thedoctorsoda.sodacantorches.reference.Names;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGoldenWaterBucket extends ItemTDS {
	Block waterBlock = Blocks.flowing_water;

	public ItemGoldenWaterBucket() {
		super();
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(Reference.RESOURCE_ID + ":" + Names.GOLDENWATERBUCKET);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		Block block = world.getBlock(x, y, z);
		if (block == Blocks.snow_layer && (world.getBlockMetadata(x, y, z) & 7) < 1) {
			p_77648_7_ = 1;
		} else if (block != Blocks.vine && block != Blocks.tallgrass && block != Blocks.deadbush) {
			if (p_77648_7_ == 0) {
				--y;
			}

			if (p_77648_7_ == 1) {
				++y;
			}

			if (p_77648_7_ == 2) {
				--z;
			}

			if (p_77648_7_ == 3) {
				++z;
			}

			if (p_77648_7_ == 4) {
				--x;
			}

			if (p_77648_7_ == 5) {
				++x;
			}
		}

		if (!player.canPlayerEdit(x, y, z, p_77648_7_, stack)) {
			return false;
		} else if (stack.stackSize == 0) {
			return false;
		} else {
			if (world.canPlaceEntityOnSide(this.waterBlock, x, y, z, false, p_77648_7_, (Entity) null, stack)) {
				int i1 = this.waterBlock.onBlockPlaced(world, x, y, z, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_, 0);

				if (world.setBlock(x, y, z, this.waterBlock, i1, 3)) {
					if (world.getBlock(x, y, z) == this.waterBlock) {
						this.waterBlock.onBlockPlacedBy(world, x, y, y, player, stack);
						this.waterBlock.onPostBlockPlaced(world, x, y, y, i1);
					}
				}
			}
			return true;
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack p_77636_1_) {
		return true;
	}
}