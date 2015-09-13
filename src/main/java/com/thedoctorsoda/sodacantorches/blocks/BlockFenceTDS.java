package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockFenceTDS extends BlockFence {

	public BlockFenceTDS(String textureName, Material material) {
		super(textureName, material);
		this.setBlockName(null);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

	public boolean canConnectFenceTo(IBlockAccess world, int x, int y, int z) {
		Block block = world.getBlock(x, y, z);
		if (block != this && block != Blocks.fence_gate && (block.isAir(world, x, y, z) || (block.isOpaqueCube() && block.renderAsNormalBlock()))) {
			return false;
		} else {
			return true;
		}
	}
}