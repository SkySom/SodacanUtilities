package com.thedoctorsoda.sodacantorches.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static int configVersion = 1;
	/*
	 * Config Versions:
	 * 
	 * 1 = 01.07.00
	 * 
	 */

	public static boolean enableTorches = true;
	public static boolean enableFlowerPots = true;
	public static boolean enableLevers = true;
	public static boolean enableLadders = true;
	public static boolean enableLanterns = true;
	public static boolean enableFences = true;
	public static boolean enableBars = true;

	public static double obsidianLadderSpeed = 0.06F;
	public static double quartzLadderSpeed = 0.06F;
	public static double blazeLadderSpeed = 0.1F;

	public static boolean enableGoldenWaterBucket = true;
	public static boolean enableWaterEraser = true;

	public static void init(File configFile) {
		Configuration configuration = new Configuration(configFile);

		try {
			configuration.load();

			// Config Version
			configVersion = configuration.get(Configuration.CATEGORY_GENERAL, "configVersion", 1, "Config File Version [DO NOT CHANGE!]").getInt();

			enableTorches = configuration.get(Configuration.CATEGORY_GENERAL, "enableTorches", true, "Enable Torches").getBoolean();
			enableFlowerPots = configuration.get(Configuration.CATEGORY_GENERAL, "enableFlowerPotes", true, "Enable Flower Pots").getBoolean();
			enableLevers = configuration.get(Configuration.CATEGORY_GENERAL, "enableLevers", true, "Enable Levers").getBoolean();
			enableLadders = configuration.get(Configuration.CATEGORY_GENERAL, "enableLadders", true, "Enable Ladders").getBoolean();
			enableBars = configuration.get(Configuration.CATEGORY_GENERAL, "enableBars", true, "Enable Bars").getBoolean();
			enableLanterns = configuration.get(Configuration.CATEGORY_GENERAL, "enableLanterns", true, "Enable Lanterns").getBoolean();
			enableFences = configuration.get(Configuration.CATEGORY_GENERAL, "enableFences", true, "Enable Fences/Fence Gates").getBoolean();

			obsidianLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "obsidianLadderSpeed", 0.06, "Obsidian Ladder Speed").getDouble();
			quartzLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "quartzLadderSpeed", 0.06, "Quartz Ladder Speed").getDouble();
			blazeLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "blazeLadderSpeed", 0.1, "Blaze Ladder Speed").getDouble();

			enableGoldenWaterBucket = configuration.get(Configuration.CATEGORY_GENERAL, "enableGoldenWaterBucket", true, "Enable Golden Water Bucket").getBoolean();
			enableWaterEraser = configuration.get(Configuration.CATEGORY_GENERAL, "enableWaterEraser", true, "Enable Water Eraser").getBoolean();

		} catch (Exception e) {

		} finally {
			configuration.save();
		}
	}
}
