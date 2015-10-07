package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.items.ItemFlowerPotTDS;
import com.thedoctorsoda.sodacantorches.items.ItemGoldenWaterBucket;
import com.thedoctorsoda.sodacantorches.items.ItemStickTDS;
import com.thedoctorsoda.sodacantorches.items.ItemWaterEraser;
import com.thedoctorsoda.sodacantorches.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ModItems {
	public static final Item golden_water_bucket = new ItemGoldenWaterBucket().setUnlocalizedName(Names.GOLDENWATERBUCKET);
	public static final Item water_eraser = new ItemWaterEraser().setUnlocalizedName(Names.WATERERASER);

	public static final Item stone_stick = new ItemStickTDS().setUnlocalizedName(Names.STONESTICK);
	public static final Item obsidian_stick = new ItemStickTDS().setUnlocalizedName(Names.OBSIDIANSTICK);
	public static final Item netherrack_stick = new ItemStickTDS().setUnlocalizedName(Names.NETHERRACKSTICK);
	public static final Item netherbrick_stick = new ItemStickTDS().setUnlocalizedName(Names.NETHERBRICKSTICK);
	public static final Item quartz_stick = new ItemStickTDS().setUnlocalizedName(Names.QUARTZSTICK);
	public static final Item ender_stick = new ItemStickTDS().setUnlocalizedName(Names.ENDERSTICK);
	public static final Item bedrock_flowerpot = new ItemFlowerPotTDS(ModBlocks.bedrock_flowerpot).setUnlocalizedName(Names.BEDROCKFLOWERPOTITEM);
	public static final Item blaze_flowerpot = new ItemFlowerPotTDS(ModBlocks.blaze_flowerpot).setUnlocalizedName(Names.BLAZEFLOWERPOTITEM);
	public static final Item wood_flowerpot = new ItemFlowerPotTDS(ModBlocks.wood_flowerpot).setUnlocalizedName(Names.WOODFLOWERPOTITEM);
	public static final Item quartz_flowerpot = new ItemFlowerPotTDS(ModBlocks.quartz_flowerpot).setUnlocalizedName(Names.QUARTZFLOWERPOTITEM);
	public static final Item stone_flowerpot = new ItemFlowerPotTDS(ModBlocks.stone_flowerpot).setUnlocalizedName(Names.STONEFLOWERPOTITEM);
	public static final Item netherrack_flowerpot = new ItemFlowerPotTDS(ModBlocks.netherrack_flowerpot).setUnlocalizedName(Names.NETHERRACKFLOWERPOTITEM);
	public static final Item obsidian_flowerpot = new ItemFlowerPotTDS(ModBlocks.obsidian_flowerpot).setUnlocalizedName(Names.OBSIDIANFLOWERPOTITEM);
	public static final Item netherbrick_flowerpot = new ItemFlowerPotTDS(ModBlocks.netherbrick_flowerpot).setUnlocalizedName(Names.NETHERBRICKFLOWERPOTITEM);

	public static final void init() {
		GameRegistry.registerItem(stone_stick, Names.STONESTICK);
		GameRegistry.registerItem(obsidian_stick, Names.OBSIDIANSTICK);
		GameRegistry.registerItem(netherrack_stick, Names.NETHERRACKSTICK);
		GameRegistry.registerItem(netherbrick_stick, Names.NETHERBRICKSTICK);
		GameRegistry.registerItem(quartz_stick, Names.QUARTZSTICK);
		GameRegistry.registerItem(ender_stick, Names.ENDERSTICK);

		if (ConfigurationHandler.enableGoldenWaterBucket) {
			GameRegistry.registerItem(golden_water_bucket, Names.GOLDENWATERBUCKET);
		}

		if (ConfigurationHandler.enableWaterEraser) {
			GameRegistry.registerItem(water_eraser, Names.WATERERASER);
		}

		if (ConfigurationHandler.enableFlowerPots) {
			GameRegistry.registerItem(bedrock_flowerpot, Names.BEDROCKFLOWERPOTITEM);
			GameRegistry.registerItem(blaze_flowerpot, Names.BLAZEFLOWERPOTITEM);
			GameRegistry.registerItem(wood_flowerpot, Names.WOODFLOWERPOTITEM);
			GameRegistry.registerItem(quartz_flowerpot, Names.QUARTZFLOWERPOTITEM);
			GameRegistry.registerItem(stone_flowerpot, Names.STONEFLOWERPOTITEM);
			GameRegistry.registerItem(netherrack_flowerpot, Names.NETHERRACKFLOWERPOTITEM);
			GameRegistry.registerItem(netherbrick_flowerpot, Names.NETHERBRICKFLOWERPOTITEM);
			GameRegistry.registerItem(obsidian_flowerpot, Names.OBSIDIANFLOWERPOTITEM);
		}
	}
}
