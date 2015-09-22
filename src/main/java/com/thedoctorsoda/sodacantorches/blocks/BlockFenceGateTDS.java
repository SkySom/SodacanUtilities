package com.thedoctorsoda.sodacantorches.blocks;

import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockFenceGateTDS extends BlockFenceGate {
	Block texture = null;

	public BlockFenceGateTDS(Block block) {
		super();
		this.texture = block;
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return texture.getBlockTextureFromSide(1);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}