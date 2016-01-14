package com.thedoctorsoda.sodacanutils.items;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGoldenWaterBucket extends ItemST {

	public ItemGoldenWaterBucket() {
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, false);

		if (movingobjectposition == null) {
			return stack;
		} else {
			ItemStack ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(player, world, stack, movingobjectposition);
			if (ret != null)
				return ret;

			if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				BlockPos blockpos = movingobjectposition.getBlockPos();

				if (!world.isBlockModifiable(player, blockpos)) {
					return stack;
				}

				BlockPos blockpos1 = blockpos.offset(movingobjectposition.sideHit);

				if (!player.canPlayerEdit(blockpos1, movingobjectposition.sideHit, stack)) {
					return stack;
				}

				if (this.tryPlaceContainedLiquid(world, blockpos1) && !player.capabilities.isCreativeMode) {
					player.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
					return stack;
				}

			}

			return stack;
		}
	}

	public boolean tryPlaceContainedLiquid(World worldIn, BlockPos pos) {
		Material material = worldIn.getBlockState(pos).getBlock().getMaterial();
		boolean flag = !material.isSolid();

		if (!worldIn.isAirBlock(pos) && !flag) {
			return false;
		} else {
			if (worldIn.provider.doesWaterVaporize()) {
				int i = pos.getX();
				int j = pos.getY();
				int k = pos.getZ();
				worldIn.playSoundEffect((double) ((float) i + 0.5F), (double) ((float) j + 0.5F), (double) ((float) k + 0.5F), "random.fizz", 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

				for (int l = 0; l < 8; ++l) {
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double) i + Math.random(), (double) j + Math.random(), (double) k + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
				}
			} else {
				if (!worldIn.isRemote && flag && !material.isLiquid()) {
					worldIn.destroyBlock(pos, true);
				}

				worldIn.setBlockState(pos, Blocks.flowing_water.getDefaultState(), 3);
			}

			return true;
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack p_77636_1_) {
		return true;
	}
}