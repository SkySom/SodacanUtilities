package com.thedoctorsoda.sodacantorches.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTorchTDS extends BlockTorch {
	public BlockTorchTDS() {
		super();
		this.setBlockName(null);
		this.setBlockTextureName(null);
		this.setLightLevel(0.9375F);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

}