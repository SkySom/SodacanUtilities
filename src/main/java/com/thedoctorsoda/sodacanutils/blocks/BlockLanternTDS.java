package com.thedoctorsoda.sodacanutils.blocks;

import java.util.Random;

import com.thedoctorsoda.sodacanutils.reference.Reference;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLanternTDS extends BlockGlass {

	public BlockLanternTDS() {
		super(Material.glass, false);
		this.setUnlocalizedName(null);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.05F);
		this.setBlockBounds(0.21F, 0, 0.21F, 0.81F, 0.751F, 0.81F);
	}

	@Override
	public int quantityDropped(Random p_149745_1_) {
		return 1;
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return null;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}