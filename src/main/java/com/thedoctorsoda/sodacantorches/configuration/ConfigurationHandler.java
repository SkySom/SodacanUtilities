package com.thedoctorsoda.sodacantorches.configuration;

import java.io.File;

import com.thedoctorsoda.sodacantorches.init.ModVariables;

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
	public static boolean enableLevers = true;
	public static boolean enableLadders = true;
	public static boolean enableLanterns = true;
	public static boolean enableFences = true;

	public static boolean enableStoneTorch = true;
	public static boolean enableObsidianTorch = true;
	public static boolean enableNetherrackTorch = true;
	public static boolean enableQuartzTorch = true;
	public static boolean enableBedrockTorch = true;
	public static boolean enableBlazeTorch = true;
	public static boolean enableBoneTorch = false;
	public static boolean enableNetherbrickTorch = true;

	public static boolean enableStoneLever = true;
	public static boolean enableObsidianLever = true;
	public static boolean enableNetherrackLever = true;
	public static boolean enableQuartzLever = true;
	public static boolean enableBedrockLever = true;
	public static boolean enableBlazeLever = true;
	public static boolean enableNetherbrickLever = true;

	public static boolean enableStoneLadder = true;
	public static boolean enableObsidianLadder = true;
	public static boolean enableNetherrackLadder = true;
	public static boolean enableQuartzLadder = true;
	public static boolean enableBedrockLadder = true;
	public static boolean enableBlazeLadder = true;
	public static boolean enableNetherbrickLadder = true;

	public static double obsidianLadderSpeed = 0.06F;
	public static double quartzLadderSpeed = 0.06F;
	public static double blazeLadderSpeed = 0.1F;

	public static boolean enableWoodLantern = true;
	public static boolean enableStoneLantern = true;
	public static boolean enableObsidianLantern = true;
	public static boolean enableNetherrackLantern = true;
	public static boolean enableQuartzLantern = true;
	public static boolean enableBlazeLantern = true;
	public static boolean enableBedrockLantern = true;
	public static boolean enableNetherbrickLantern = true;

	public static boolean enableWoodFence = true;
	public static boolean enableStoneFence = true;
	public static boolean enableObsidianFence = true;
	public static boolean enableNetherrackFence = true;
	public static boolean enableQuartzFence = true;
	public static boolean enableBlazeFence = true;
	public static boolean enableBedrockFence = true;
	public static boolean enableNetherbrickFence = true;

	public static boolean enableGoldenWaterBucket = true;
	public static boolean enableWaterEraser = true;

	public static void init(File configFile) {
		Configuration configuration = new Configuration(configFile);

		try {
			configuration.load();

			configVersion = configuration.get(Configuration.CATEGORY_GENERAL, "configVersion", 1, "Config File Version [DO NOT CHANGE!]").getInt();

			// Torches
			enableTorches = configuration.get(Configuration.CATEGORY_GENERAL, "enableTorches", true, "Enable Torches").getBoolean();

			enableStoneTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneTorch", true, "Enable Stone Torch").getBoolean();
			enableObsidianTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianTorch", true, "Enable Obsidian Torch").getBoolean();
			enableNetherrackTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackTorch", true, "Enable Netherrack Torch").getBoolean();
			enableNetherbrickTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherbrickTorch", true, "Enable Nether Brick Torch").getBoolean();
			enableQuartzTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzTorch", true, "Enable Quartz Torch").getBoolean();
			enableBedrockTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockTorch", true, "Enable Bedrock Torch").getBoolean();
			enableBlazeTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeTorch", true, "Enable Blaze Torch").getBoolean();
			enableBoneTorch = configuration.get(Configuration.CATEGORY_GENERAL, "enableBoneTorch", false, "Enable Bone Torch").getBoolean();

			// Levers
			enableLevers = configuration.get(Configuration.CATEGORY_GENERAL, "enableLevers", true, "Enable Levers").getBoolean();

			enableStoneLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneLever", true, "Enable Stone Lever").getBoolean();
			enableObsidianLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianLever", true, "Enable Obsidian Lever").getBoolean();
			enableNetherrackLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackLever", true, "Enable Netherrack Lever").getBoolean();
			enableNetherbrickLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherbrickLever", true, "Enable Nether Brick Lever").getBoolean();
			enableQuartzLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzLever", true, "Enable Quartz Lever").getBoolean();
			enableBedrockLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockLever", true, "Enable Bedrock Lever").getBoolean();
			enableBlazeLever = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeLever", true, "Enable Blaze Lever").getBoolean();

			// Ladders
			enableLadders = configuration.get(Configuration.CATEGORY_GENERAL, "enableLadders", true, "Enable Ladders").getBoolean();

			enableStoneLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneLadder", true, "Enable Stone Ladder").getBoolean();
			enableObsidianLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianLadder", true, "Enable Obsidian Ladder").getBoolean();
			enableNetherrackLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackLadder", true, "Enable Netherrack Ladder").getBoolean();
			enableNetherbrickLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherbrickLadder", true, "Enable Nether Brick Ladder").getBoolean();
			enableQuartzLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzLadder", true, "Enable Quartz Ladder").getBoolean();
			enableBedrockLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockLadder", true, "Enable Bedrock Ladder").getBoolean();
			enableBlazeLadder = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeLadder", true, "Enable Blaze Ladder").getBoolean();

			obsidianLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "obsidianLadderSpeed", 0.06, "Obsidian Ladder Speed").getDouble();
			quartzLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "quartzLadderSpeed", 0.06, "Quartz Ladder Speed").getDouble();
			blazeLadderSpeed = configuration.get(Configuration.CATEGORY_GENERAL, "blazeLadderSpeed", 0.1, "Blaze Ladder Speed").getDouble();

			// Lanterns
			enableLanterns = configuration.get(Configuration.CATEGORY_GENERAL, "enableLanterns", true, "Enable Lanterns").getBoolean();

			enableStoneLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneLantern", true, "Enable Stone Lantern").getBoolean();
			enableObsidianLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianLantern", true, "Enable Obsidian Lantern").getBoolean();
			enableNetherrackLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackLantern", true, "Enable Netherrack Lantern").getBoolean();
			enableNetherbrickLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherbrickLantern", true, "Enable Nether Brick Lantern").getBoolean();
			enableQuartzLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzLantern", true, "Enable Quartz Lantern").getBoolean();
			enableBedrockLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockLantern", true, "Enable Bedrock Lantern").getBoolean();
			enableBlazeLantern = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeLantern", true, "Enable Blaze Lantern").getBoolean();

			// Fences
			enableFences = configuration.get(Configuration.CATEGORY_GENERAL, "enableFences", true, "Enable Fences/Fence Gates").getBoolean();

			enableStoneFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableStoneFence", true, "Enable Stone Fence/Gate").getBoolean();
			enableObsidianFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableObsidianFence", true, "Enable Obsidian Fence/Gate").getBoolean();
			enableNetherrackFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherrackFence", true, "Enable Netherrack Fence/Gate").getBoolean();
			enableNetherbrickFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableNetherbrickFence", true, "Enable Nether Brick Fence/Gate").getBoolean();
			enableQuartzFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableQuartzFence", true, "Enable Quartz Fence/Gate").getBoolean();
			enableBedrockFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableBedrockFence", true, "Enable Bedrock Fence/Gate").getBoolean();
			enableBlazeFence = configuration.get(Configuration.CATEGORY_GENERAL, "enableBlazeFence", true, "Enable Blaze Fence/Gate").getBoolean();

			// Golden Water Bucket
			enableGoldenWaterBucket = configuration.get(Configuration.CATEGORY_GENERAL, "enableGoldenWaterBucket", true, "Enable Golden Water Bucket").getBoolean();

			// Water Eraser
			enableWaterEraser = configuration.get(Configuration.CATEGORY_GENERAL, "enableWaterEraser", true, "Enable Water Eraser").getBoolean();
		} catch (Exception e) {

		} finally {
			configuration.save();
		}
		if (enableStoneTorch || enableStoneLever || enableStoneLadder || enableStoneLantern || enableStoneFence) {
			ModVariables.anyStone = true;
		}
		if (enableNetherrackTorch || enableNetherrackLever || enableNetherrackLadder || enableNetherrackLantern || enableNetherrackFence) {
			ModVariables.anyNetherrack = true;
		}

		if (enableNetherbrickTorch || enableNetherbrickLever || enableNetherbrickLadder || enableNetherbrickLantern || enableNetherbrickFence) {
			ModVariables.anyNetherbrick = true;
		}

		if (enableObsidianTorch || enableObsidianLever || enableObsidianLadder || enableObsidianLantern || enableObsidianFence) {
			ModVariables.anyObsidian = true;
		}
		if (enableQuartzTorch || enableQuartzLever || enableQuartzLadder || enableQuartzLantern || enableQuartzFence) {
			ModVariables.anyQuartz = true;
		}
	}
}
