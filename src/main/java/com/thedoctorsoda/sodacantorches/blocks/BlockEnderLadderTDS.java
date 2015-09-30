package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.init.ModBlocks;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEnderLadderTDS extends BlockLadder {

	public BlockEnderLadderTDS() {
		super();
		this.setBlockName(null);
		this.setBlockTextureName(null);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity.onGround || entity.isCollidedVertically) {
			return;
		}

		if (entity.motionY >= 0.1) {
			if (world.getBlock(x, y, z) == ModBlocks.ender_ladder) {
				for (int i = 1; i < world.getActualHeight(); i++) {
					if (world.getBlock(x, y + i, z) == ModBlocks.ender_ladder) {
						entity.setPosition(entity.posX, y + i + 2, entity.posZ);
						if (world.isRemote) {
							entity.worldObj.spawnParticle("portal", entity.posX, entity.posY - 1, entity.posZ, 0, 0, 0);
							entity.playSound("mob.endermen.portal", 1.0F, 1.0F);
						}

					} else {
						i = world.getActualHeight();
					}
				}
			}
		}
	}

	@Override
	public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity) {
		return false;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}