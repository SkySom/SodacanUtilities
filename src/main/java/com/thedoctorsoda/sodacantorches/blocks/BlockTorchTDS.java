package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IIconRegister;
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

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}