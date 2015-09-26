package com.thedoctorsoda.sodacantorches.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBarsTDS extends BlockPane {
	public BlockBarsTDS(String textureName, Material material, boolean bool) {
		super(textureName + "_top", textureName, material, bool);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return 18;
	}
}