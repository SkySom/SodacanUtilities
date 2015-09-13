package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.items.ItemStickTDS;
import com.thedoctorsoda.sodacantorches.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

	public static final ItemStickTDS stone_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.STONESTICK);
	public static final ItemStickTDS iron_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.IRONSTICK);
	public static final ItemStickTDS gold_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.GOLDSTICK);
	public static final ItemStickTDS diamond_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.DIAMONDSTICK);
	public static final ItemStickTDS obsidian_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.OBSIDIANSTICK);
	public static final ItemStickTDS netherrack_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.NETHERRACKSTICK);
	public static final ItemStickTDS quartz_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.QUARTZSTICK);

	public static final ItemStickTDS bronze_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.BRONZESTICK);
	public static final ItemStickTDS steel_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.STEELSTICK);

	public static final void init() {
		if (ConfigurationHandler.enableStoneTorch || ConfigurationHandler.enableStoneLadder) {
			GameRegistry.registerItem(stone_stick, Names.STONESTICK);
		}
		if (ConfigurationHandler.enableObsidianTorch || ConfigurationHandler.enableObsidianLadder) {
			GameRegistry.registerItem(obsidian_stick, Names.OBSIDIANSTICK);
		}
		if (ConfigurationHandler.enableNetherrackTorch || ConfigurationHandler.enableNetherrackLadder) {
			GameRegistry.registerItem(netherrack_stick, Names.NETHERRACKSTICK);
		}
		if (ConfigurationHandler.enableQuartzTorch || ConfigurationHandler.enableQuartzLadder) {
			GameRegistry.registerItem(quartz_stick, Names.QUARTZSTICK);
		}
		if (ConfigurationHandler.enableUnusedSticks) {
			GameRegistry.registerItem(iron_stick, Names.IRONSTICK);
			GameRegistry.registerItem(gold_stick, Names.GOLDSTICK);
			GameRegistry.registerItem(diamond_stick, Names.DIAMONDSTICK);
			GameRegistry.registerItem(bronze_stick, Names.BRONZESTICK);
			GameRegistry.registerItem(steel_stick, Names.STEELSTICK);
		}
	}
}
