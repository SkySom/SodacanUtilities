package com.thedoctorsoda.sodacantorches.init;

import java.util.Iterator;
import java.util.List;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
	public static void init() {

		// Wood Lantern
		if (ConfigurationHandler.enableWoodLantern) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "stickWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "rodWood"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "woodRod"));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "stickWooden"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "rodWooden"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wood_lantern, 1), "mmm", "gtg", "msm", 'm', "plankWood", 'g', "paneGlass", 't', "torchWood", 's', "woodenRod"));
		}

		// Stone
		if (ConfigurationHandler.enableStoneLadder || ConfigurationHandler.enableStoneTorch) {

			// Stick
			GameRegistry.addRecipe(new ItemStack(ModItems.stone_stick, 2), "b", "b", 'b', new ItemStack(Blocks.cobblestone));
			GameRegistry.addRecipe(new ItemStack(ModItems.stone_stick, 4), "b", "b", 'b', new ItemStack(Blocks.stone));

			// Torch
			if (ConfigurationHandler.enableStoneTorch && ConfigurationHandler.enableTorches) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_torch, 4), "c", "s", 'c', "torchFuel", 's', "stickStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_torch, 4), "c", "s", 'c', "torchFuel", 's', "rodStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_torch, 4), "c", "s", 'c', "torchFuel", 's', "stoneRod"));
			}

			// Ladder
			if (ConfigurationHandler.enableStoneLadder) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_ladder, 3), "m m", "mmm", "m m", 'm', "stickStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_ladder, 3), "m m", "mmm", "m m", 'm', "rodStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_ladder, 3), "m m", "mmm", "m m", 'm', "stoneRod"));
			}

			// Lantern
			if (ConfigurationHandler.enableStoneLantern) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_lantern, 1), "mmm", "gtg", "msm", 'm', "stoneAll", 'g', "paneGlass", 't', "torchWood", 's', "stickStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_lantern, 1), "mmm", "gtg", "msm", 'm', "stoneAll", 'g', "paneGlass", 't', "torchWood", 's', "rodStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_lantern, 1), "mmm", "gtg", "msm", 'm', "stoneAll", 'g', "paneGlass", 't', "torchWood", 's', "stoneRod"));
			}

			// Fence/Gate
			if (ConfigurationHandler.enableStoneFence) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence, 2), "sss", "sss", 's', "stickStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence_gate), "sms", "sms", 's', "stickStone", 'm', "stoneAll"));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence, 2), "sss", "sss", 's', "rodStone"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence_gate), "sms", "sms", 's', "rodStone", 'm', "stoneAll"));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence, 2), "sss", "sss", 's', "stoneRod"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_fence_gate), "sms", "sms", 's', "stoneRod", 'm', "stoneAll"));
			}
		}

		// Obsidian
		if (ConfigurationHandler.enableObsidianLadder || ConfigurationHandler.enableObsidianTorch) {

			// Stick
			GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_stick, 4), "b", "b", 'b', new ItemStack(Blocks.obsidian));

			// Torch
			if (ConfigurationHandler.enableObsidianTorch && ConfigurationHandler.enableTorches) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_torch, 16), "c", "s", 'c', "torchFuel", 's', "stickObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_torch, 16), "c", "s", 'c', "torchFuel", 's', "rodObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_torch, 16), "c", "s", 'c', "torchFuel", 's', "obsidianRod"));
			}

			// Ladder
			if (ConfigurationHandler.enableObsidianLadder) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_ladder, 12), "m m", "mmm", "m m", 'm', "stickObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_ladder, 12), "m m", "mmm", "m m", 'm', "rodObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_ladder, 12), "m m", "mmm", "m m", 'm', "obsidianRod"));
			}

			// Lantern
			if (ConfigurationHandler.enableObsidianLantern) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.obsidian), 'g', "paneGlass", 't', "torchWood", 's', "stickObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.obsidian), 'g', "paneGlass", 't', "torchWood", 's', "rodObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.obsidian), 'g', "paneGlass", 't', "torchWood", 's', "obsidianRod"));
			}

			// Fence/Gate
			if (ConfigurationHandler.enableObsidianFence) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence, 12), "sss", "sss", 's', "stickObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence_gate), "sms", "sms", 's', "stickObsidian", 'm', new ItemStack(Blocks.obsidian)));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence, 12), "sss", "sss", 's', "rodObsidian"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence_gate), "sms", "sms", 's', "rodObsidian", 'm', new ItemStack(Blocks.obsidian)));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence, 12), "sss", "sss", 's', "obsidianRod"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_fence_gate), "sms", "sms", 's', "obsidianRod", 'm', new ItemStack(Blocks.obsidian)));
			}
		}

		// Netherrack
		if (ConfigurationHandler.enableNetherrackLadder || ConfigurationHandler.enableNetherrackTorch) {

			// Stick
			GameRegistry.addRecipe(new ItemStack(ModItems.netherrack_stick, 2), "b", "b", 'b', new ItemStack(Blocks.netherrack));
			GameRegistry.addRecipe(new ItemStack(ModItems.netherrack_stick, 2), "b", "b", 'b', new ItemStack(Items.netherbrick));
			GameRegistry.addRecipe(new ItemStack(ModItems.netherrack_stick, 8), "b", "b", 'b', new ItemStack(Blocks.nether_brick));

			// Torch
			if (ConfigurationHandler.enableNetherrackTorch && ConfigurationHandler.enableTorches) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_torch, 16), "c", "s", 'c', new ItemStack(Items.flint_and_steel), 's', "stickNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_torch, 16), "c", "s", 'c', new ItemStack(Items.flint_and_steel), 's', "rodNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_torch, 16), "c", "s", 'c', new ItemStack(Items.flint_and_steel), 's', "netherrackRod"));
			}

			// Ladder
			if (ConfigurationHandler.enableNetherrackLadder) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_ladder, 3), "m m", "mmm", "m m", 'm', "stickNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_ladder, 3), "m m", "mmm", "m m", 'm', "rodNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_ladder, 3), "m m", "mmm", "m m", 'm', "netherrackRod"));
			}

			// Lantern
			if (ConfigurationHandler.enableNetherrackLantern) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.netherrack), 'g', "paneGlass", 't', "torchWood", 's', "stickNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.netherrack), 'g', "paneGlass", 't', "torchWood", 's', "rodNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_lantern, 1), "mmm", "gtg", "msm", 'm', new ItemStack(Blocks.netherrack), 'g', "paneGlass", 't', "torchWood", 's', "netherrackRod"));
			}

			// Fence/Gate
			if (ConfigurationHandler.enableNetherrackFence) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence, 2), "sss", "sss", 's', "stickNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence_gate), "sms", "sms", 's', "stickNetherrack", 'm', new ItemStack(Blocks.netherrack)));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence, 2), "sss", "sss", 's', "rodNetherrack"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence_gate), "sms", "sms", 's', "rodNetherrack", 'm', new ItemStack(Blocks.netherrack)));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence, 2), "sss", "sss", 's', "netherrackRod"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherrack_fence_gate), "sms", "sms", 's', "netherrackRod", 'm', new ItemStack(Blocks.netherrack)));
			}
		}

		// Quartz
		if (ConfigurationHandler.enableQuartzLadder || ConfigurationHandler.enableQuartzTorch) {

			// Stick
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartz_stick, 1), "b", "b", 'b', "blockQuartz"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartz_stick, 4), "b", "b", 'b', "blockQuartz"));

			// Torch
			if (ConfigurationHandler.enableQuartzTorch && ConfigurationHandler.enableTorches) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_torch, 8), "c", "s", 'c', "torchFuel", 's', "stickQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_torch, 8), "c", "s", 'c', "torchFuel", 's', "rodQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_torch, 8), "c", "s", 'c', "torchFuel", 's', "quartzRod"));
			}

			// Ladder
			if (ConfigurationHandler.enableQuartzLadder) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_ladder, 9), "m m", "mmm", "m m", 'm', "stickQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_ladder, 9), "m m", "mmm", "m m", 'm', "rodQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_ladder, 9), "m m", "mmm", "m m", 'm', "quartzRod"));
			}

			// Lantern
			if (ConfigurationHandler.enableQuartzLantern) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_lantern, 1), "mmm", "gtg", "msm", 'm', "blockQuartz", 'g', "paneGlass", 't', "torchWood", 's', "stickQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_lantern, 1), "mmm", "gtg", "msm", 'm', "blockQuartz", 'g', "paneGlass", 't', "torchWood", 's', "rodQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_lantern, 1), "mmm", "gtg", "msm", 'm', "blockQuartz", 'g', "paneGlass", 't', "torchWood", 's', "quartzRod"));
			}

			// Fence/Gate
			if (ConfigurationHandler.enableQuartzFence) {
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence, 8), "sss", "sss", 's', "stickQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence_gate), "sms", "sms", 's', "stickQuartz", 'm', "blockQuartz"));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence, 8), "sss", "sss", 's', "rodQuartz"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence_gate), "sms", "sms", 's', "rodQuartz", 'm', "blockQuartz"));

				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence, 8), "sss", "sss", 's', "quartzRod"));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_fence_gate), "sms", "sms", 's', "quartzRod", 'm', "blockQuartz"));
			}
		}

		// Blaze Torch
		if (ConfigurationHandler.enableBlazeTorch && ConfigurationHandler.enableTorches) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_torch, 4), "c", "s", 'c', "dustGlowstone", 's', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_torch, 4), "c", "s", 'c', "dustGlowstone", 's', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_torch, 4), "c", "s", 'c', "dustGlowstone", 's', "blazeRod"));
		}

		// Blaze Ladder
		if (ConfigurationHandler.enableBlazeLadder) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_ladder, 16), "m m", "mmm", "m m", 'm', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_ladder, 16), "m m", "mmm", "m m", 'm', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_ladder, 16), "m m", "mmm", "m m", 'm', "blazeRod"));
		}

		// Blaze Lantern
		if (ConfigurationHandler.enableBlazeLantern) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "stickBlaze", 'g', "paneGlass", 't', "torchWood", 's', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "stickBlaze", 'g', "paneGlass", 't', "torchWood", 's', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "stickBlaze", 'g', "paneGlass", 't', "torchWood", 's', "blazeRod"));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "rodBlaze", 'g', "paneGlass", 't', "torchWood", 's', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "rodBlaze", 'g', "paneGlass", 't', "torchWood", 's', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "rodBlaze", 'g', "paneGlass", 't', "torchWood", 's', "blazeRod"));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "blazeRod", 'g', "paneGlass", 't', "torchWood", 's', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "blazeRod", 'g', "paneGlass", 't', "torchWood", 's', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_lantern, 1), "mmm", "gtg", "msm", 'm', "blazeRod", 'g', "paneGlass", 't', "torchWood", 's', "blazeRod"));
		}

		// Blaze Fence/Gate
		if (ConfigurationHandler.enableBlazeFence) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence, 16), "sss", "sss", 's', "stickBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence_gate), "sms", "sms", 's', "stickBlaze", 'm', "blockCoal"));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence, 16), "sss", "sss", 's', "rodBlaze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence_gate), "sms", "sms", 's', "rodBlaze", 'm', "blockCoal"));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence, 16), "sss", "sss", 's', "blazeRod"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blaze_fence_gate), "sms", "sms", 's', "blazeRod", 'm', "blockCoal"));
		}

		// Bone Torch
		if (ConfigurationHandler.enableBoneTorch && ConfigurationHandler.enableTorches) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.bone_torch, 4), "c", "s", 'c', "torchFuel", 's', new ItemStack(Items.bone)));
		}

		// Golden Water Bucket
		if (ConfigurationHandler.enableGoldenWaterBucket) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.golden_water_bucket), "gng", "gwg", "gwg", 'g', "ingotGold", 'n', new ItemStack(Items.nether_wart), 'w', new ItemStack(Items.water_bucket)));

		}

		// Water Eraser
		if (ConfigurationHandler.enableWaterEraser) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.water_eraser), " ww", "www", "ww ", 'w', new ItemStack(Blocks.wool, 1, 6)));
		}

		// Unused Sticks
		if (ConfigurationHandler.enableUnusedSticks) {
			// Iron
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.iron_stick, 4), "b", "b", 'b', "ingotIron"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.iron_stick, 36), "b", "b", 'b', "blockIron"));

			// Gold
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gold_stick, 4), "b", "b", 'b', "ingotGold"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gold_stick, 36), "b", "b", 'b', "blockGold"));

			// Diamond
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.diamond_stick, 4), "b", "b", 'b', "gemDiamond"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.diamond_stick, 36), "b", "b", 'b', "blockDiamond"));

			// Bronze
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronze_stick, 4), "b", "b", 'b', "ingotBronze"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.bronze_stick, 36), "b", "b", 'b', "blockBronze"));

			// Steel
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steel_stick, 4), "b", "b", 'b', "ingotSteel"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.steel_stick, 36), "b", "b", 'b', "blockSteel"));
		}

		// Nether Brick Fence/Fence Gate
		if (ConfigurationHandler.enableNetherBrickFenceGate) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherbrick_fence_gate), "sms", "sms", 's', "ingotBrickNether", 'm', new ItemStack(Blocks.nether_brick)));
		}
		if (ConfigurationHandler.enableNetherBrickFenceRecipeOverride) {
			List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

			Iterator<IRecipe> NetherBrick = recipes.iterator();

			while (NetherBrick.hasNext()) {
				ItemStack is = NetherBrick.next().getRecipeOutput();
				if (is != null && is.getItem() == Item.getItemFromBlock(Blocks.nether_brick))
					NetherBrick.remove();
			}
			;
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.nether_brick_fence, 2), "sss", "sss", 's', "ingotBrickNether"));
		}

		// Tool Recipes
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.wooden_pickaxe), "mmm", " s ", " s ", 's', "stickAll", 'm', "plankWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.wooden_sword), "m", "m", "s", 's', "stickAll", 'm', "plankWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.wooden_hoe), "mm", " s", " s", 's', "stickAll", 'm', "plankWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.wooden_axe), "mm", "ms", " s", 's', "stickAll", 'm', "plankWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.wooden_shovel), "m", "s", "s", 's', "stickAll", 'm', "plankWood"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_pickaxe), "mmm", " s ", " s ", 's', "stickAll", 'm', "cobblestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_sword), "m", "m", "s", 's', "stickAll", 'm', "cobblestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_hoe), "mm", " s", " s", 's', "stickAll", 'm', "cobblestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_axe), "mm", "ms", " s", 's', "stickAll", 'm', "cobblestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.stone_shovel), "m", "s", "s", 's', "stickAll", 'm', "cobblestone"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_pickaxe), "mmm", " s ", " s ", 's', "stickAll", 'm', "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_sword), "m", "m", "s", 's', "stickAll", 'm', "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_hoe), "mm", " s", " s", 's', "stickAll", 'm', "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_axe), "mm", "ms", " s", 's', "stickAll", 'm', "ingotIron"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_shovel), "m", "s", "s", 's', "stickAll", 'm', "ingotIron"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_pickaxe), "mmm", " s ", " s ", 's', "stickAll", 'm', "ingotGold"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_sword), "m", "m", "s", 's', "stickAll", 'm', "ingotGold"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_hoe), "mm", " s", " s", 's', "stickAll", 'm', "ingotGold"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_axe), "mm", "ms", " s", 's', "stickAll", 'm', "ingotGold"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_shovel), "m", "s", "s", 's', "stickAll", 'm', "ingotGold"));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond_pickaxe), "mmm", " s ", " s ", 's', "stickAll", 'm', "gemDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond_sword), "m", "m", "s", 's', "stickAll", 'm', "gemDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond_hoe), "mm", " s", " s", 's', "stickAll", 'm', "gemDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond_axe), "mm", "ms", " s", 's', "stickAll", 'm', "gemDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond_shovel), "m", "s", "s", 's', "stickAll", 'm', "gemDiamond"));
	}
}
