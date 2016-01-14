package com.thedoctorsoda.sodacanutils.blocks;

import com.thedoctorsoda.sodacanutils.reference.Reference;

import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTorchTDS extends BlockTorch {
	public BlockTorchTDS() {
		super();
		this.setLightLevel(0.9375F);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}