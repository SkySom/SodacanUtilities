package com.thedoctorsoda.sodacanutils.blocks;

import com.thedoctorsoda.sodacanutils.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTDS extends Block {
	public BlockTDS(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	public BlockTDS() {
		this(Material.rock);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}