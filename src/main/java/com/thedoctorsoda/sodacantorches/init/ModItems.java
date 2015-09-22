package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.items.ItemGoldenWaterBucket;
import com.thedoctorsoda.sodacantorches.items.ItemStickTDS;
import com.thedoctorsoda.sodacantorches.items.ItemWaterEraser;
import com.thedoctorsoda.sodacantorches.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {
	public static final ItemGoldenWaterBucket golden_water_bucket = (ItemGoldenWaterBucket) new ItemGoldenWaterBucket().setUnlocalizedName(Names.GOLDENWATERBUCKET);
	public static final ItemWaterEraser water_eraser = (ItemWaterEraser) new ItemWaterEraser().setUnlocalizedName(Names.WATERERASER);

	public static final ItemStickTDS stone_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.STONESTICK);
	public static final ItemStickTDS obsidian_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.OBSIDIANSTICK);
	public static final ItemStickTDS netherrack_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.NETHERRACKSTICK);
	public static final ItemStickTDS netherbrick_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.NETHERBRICKSTICK);
	public static final ItemStickTDS quartz_stick = (ItemStickTDS) new ItemStickTDS().setUnlocalizedName(Names.QUARTZSTICK);

	public static final void init() {
		if (ModVariables.anyStone) {
			GameRegistry.registerItem(stone_stick, Names.STONESTICK);
		}
		if (ModVariables.anyObsidian) {
			GameRegistry.registerItem(obsidian_stick, Names.OBSIDIANSTICK);
		}
		if (ModVariables.anyNetherrack) {
			GameRegistry.registerItem(netherrack_stick, Names.NETHERRACKSTICK);
		}
		if (ModVariables.anyNetherbrick) {
			GameRegistry.registerItem(netherbrick_stick, Names.NETHERBRICKSTICK);
		}
		if (ModVariables.anyQuartz) {
			GameRegistry.registerItem(quartz_stick, Names.QUARTZSTICK);
		}
		if (ConfigurationHandler.enableGoldenWaterBucket) {
			GameRegistry.registerItem(golden_water_bucket, Names.GOLDENWATERBUCKET);
		}
		if (ConfigurationHandler.enableWaterEraser) {
			GameRegistry.registerItem(water_eraser, Names.WATERERASER);
		}
	}
}
