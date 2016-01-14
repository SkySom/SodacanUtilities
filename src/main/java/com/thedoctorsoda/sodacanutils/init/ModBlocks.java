package com.thedoctorsoda.sodacanutils.init;

import com.thedoctorsoda.sodacanutils.blocks.BlockLanternTDS;
import com.thedoctorsoda.sodacanutils.blocks.BlockTorchTDS;
import com.thedoctorsoda.sodacanutils.reference.Names;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static final Block stone_torch = (BlockTorchTDS) new BlockTorchTDS().setUnlocalizedName(Names.stone_torch).setLightLevel(0.9375F);
	public static final Block obsidian_torch = (BlockTorchTDS) new BlockTorchTDS().setUnlocalizedName(Names.obsidian_torch).setLightLevel(0.9375F).setResistance(6000F).setHardness(5F);

	public static final Block wooden_lantern = new BlockLanternTDS().setUnlocalizedName(Names.wooden_lantern).setResistance(13).setLightLevel(1F);
	public static final Block stone_lantern = new BlockLanternTDS().setUnlocalizedName(Names.stone_lantern).setResistance(13).setLightLevel(1F);
	public static final Block obsidian_lantern = new BlockLanternTDS().setUnlocalizedName(Names.obsidian_lantern).setResistance(6000F).setLightLevel(1F).setHardness(5F);
	public static final Block netherbrick_lantern = new BlockLanternTDS().setUnlocalizedName(Names.netherbrick_lantern).setResistance(13).setLightLevel(1F);
	public static final Block quartz_lantern = new BlockLanternTDS().setUnlocalizedName(Names.quartz_lantern).setResistance(13).setLightLevel(1F);

	// public static final BlockTDS logoblock = (BlockTDS) new
	// BlockTDS().setUnlocalizedName("logoblock");

	// public static final BlockTDS blaze_block = (BlockTDS) new
	// BlockTDS(Material.circuits).setUnlocalizedName(Names.BLAZEBLOCK);
	// public static final BlockTDS charcoal_block = (BlockTDS) new
	// BlockTDS(Material.rock).setUnlocalizedName(Names.CHARCOALBLOCK);

	public static final void init() {
		// Torches
		GameRegistry.registerBlock(stone_torch, Names.stone_torch);
		GameRegistry.registerBlock(obsidian_torch, Names.obsidian_torch);

		// Lanterns
		GameRegistry.registerBlock(wooden_lantern, Names.wooden_lantern);
		GameRegistry.registerBlock(stone_lantern, Names.stone_lantern);
		GameRegistry.registerBlock(obsidian_lantern, Names.obsidian_lantern);
		GameRegistry.registerBlock(quartz_lantern, Names.quartz_lantern);
		GameRegistry.registerBlock(netherbrick_lantern, Names.netherbrick_lantern);

		// GameRegistry.registerBlock(logoblock, Names.LOGOBLOCK);

		// GameRegistry.registerBlock(hardened_sand, Names.HARDENEDSAND);
		// GameRegistry.registerBlock(sandy_brick, Names.SANDYBRICK);

		// GameRegistry.registerBlock(blaze_block, Names.BLAZEBLOCK);
		// GameRegistry.registerBlock(charcoal_block, Names.CHARCOALBLOCK);
	}
}