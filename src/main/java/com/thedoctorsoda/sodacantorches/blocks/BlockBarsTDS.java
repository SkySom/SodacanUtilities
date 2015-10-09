package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBarsTDS extends BlockPane {
	public BlockBarsTDS(String textureName, Material material, boolean bool) {
		super(Reference.RESOURCE_ID + ":" + textureName + "_top", Reference.RESOURCE_ID + ":" + textureName, material, bool);
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