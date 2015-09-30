package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlowerPotTDS extends BlockFlowerPot {
	public BlockFlowerPotTDS() {
		super();
		this.setBlockName(null);
		this.setBlockTextureName(null);
		this.setCreativeTab(CreativeTabs.tabDecorations);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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