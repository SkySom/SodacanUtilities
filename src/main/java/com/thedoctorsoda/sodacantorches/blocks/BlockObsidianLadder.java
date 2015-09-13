package com.thedoctorsoda.sodacantorches.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockObsidianLadder extends BlockLadder {
	public BlockObsidianLadder() {
		super();
		this.setBlockName(null);
		this.setBlockTextureName(null);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if (entity.onGround || entity.isCollidedVertically) {
			return;
		}

		if (entity.motionY >= 0.1) {
			entity.setPosition(entity.posX, entity.posY + 0.03, entity.posZ);
		} else if (entity.motionY <= -0.1) {
			Block blockUnder = entity.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY) - 3, MathHelper.floor_double(entity.posZ));
			if (blockUnder == null || blockUnder == this) { // prevent clipping
															// into block
				entity.setPosition(entity.posX, entity.posY - 0.03, entity.posZ);
			}
		}
	}
}