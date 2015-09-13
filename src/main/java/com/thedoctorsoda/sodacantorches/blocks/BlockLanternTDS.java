package com.thedoctorsoda.sodacantorches.blocks;

import java.util.Random;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockLanternTDS extends BlockGlass {

	public IIcon[] icons = new IIcon[6];

	public BlockLanternTDS(String textureName) {
		super(Material.glass, false);
		this.setBlockName(null);
		this.setBlockTextureName(textureName);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setBlockBounds(0.2F, 0, 0.2F, 0.8F, 0.75F, 0.8F);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}

	@Override
	public int quantityDropped(Random p_149745_1_) {
		return 1;
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.icons[0] = reg.registerIcon(this.textureName + "_bottom");
		this.icons[1] = reg.registerIcon(this.textureName + "_top");
		this.icons[2] = reg.registerIcon(this.textureName + "_side");
		this.icons[3] = reg.registerIcon(this.textureName + "_side");
		this.icons[4] = reg.registerIcon(this.textureName + "_side");
		this.icons[5] = reg.registerIcon(this.textureName + "_side");
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}