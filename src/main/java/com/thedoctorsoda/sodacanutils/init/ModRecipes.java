package com.thedoctorsoda.sodacanutils.init;

import com.thedoctorsoda.sodacanutils.configuration.ConfigurationHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
	public static void init() {

		// Sticks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stone_stick, 2), "b", "b", 'b', "cobblestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stone_stick, 2), "b", "b", 'b', "marble"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stone_stick, 2), "b", "b", 'b', "limestone"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stone_stick, 4), "b", "b", 'b', "stone"));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidian_stick, 4), "b", "b", 'b', new ItemStack(Blocks.obsidian));

		// Lanterns
		if (ConfigurationHandler.enableLanterns) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.wooden_lantern, 1), "mmm", "gtg", "mmm", 'm', "plankWood", 'g', "paneGlass", 't', "torchAll"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_lantern, 1), "mmm", "gtg", "mmm", 'm', "stoneAll", 'g', "paneGlass", 't', "torchAll"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.netherbrick_lantern, 1), "mmm", "gtg", "mmm", 'm', new ItemStack(Blocks.nether_brick), 'g', "paneGlass", 't', "torchAll"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_lantern, 1), "mmm", "gtg", "mmm", 'm', new ItemStack(Blocks.obsidian), 'g', "paneGlass", 't', "torchAll"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.quartz_lantern, 1), "mmm", "gtg", "mmm", 'm', "blockQuartz", 'g', "paneGlass", 't', "torchAll"));
		}

		// Torches
		if (ConfigurationHandler.enableTorches) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.stone_torch, 4), "c", "s", 'c', "torchFuel", 's', "stickStone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.obsidian_torch, 16), "c", "s", 'c', "torchFuel", 's', "stickObsidian"));
		}

		// Golden Water Bucket
		if (ConfigurationHandler.enableGoldenWaterBucket)

		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.golden_water_bucket), "gng", "gwg", "gwg", 'g', "ingotGold", 'n', new ItemStack(Items.nether_wart), 'w', new ItemStack(Items.water_bucket)));

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
