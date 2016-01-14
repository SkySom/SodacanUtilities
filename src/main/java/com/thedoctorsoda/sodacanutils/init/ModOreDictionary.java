package com.thedoctorsoda.sodacanutils.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
	public static void init() {
		OreDictionary.registerOre("torchFuel", new ItemStack(Items.coal, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("stoneAll", new ItemStack(Blocks.cobblestone, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("stoneAll", new ItemStack(Blocks.stone, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("torchAll", new ItemStack(Blocks.torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(Blocks.redstone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.stone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.obsidian_torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("torchWood", new ItemStack(Blocks.torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchWooden", new ItemStack(Blocks.torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchRedstone", new ItemStack(Blocks.redstone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchStone", new ItemStack(ModBlocks.stone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchObsidian", new ItemStack(ModBlocks.obsidian_torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("torchWood", new ItemStack(Blocks.torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("stickAll", Items.stick);
		OreDictionary.registerOre("stickAll", Items.blaze_rod);
		OreDictionary.registerOre("stickAll", ModItems.stone_stick);
		OreDictionary.registerOre("stickAll", ModItems.obsidian_stick);

		OreDictionary.registerOre("stickStone", ModItems.stone_stick);
		OreDictionary.registerOre("rodStone", ModItems.stone_stick);
		OreDictionary.registerOre("stoneRod", ModItems.stone_stick);

		OreDictionary.registerOre("stickObsidian", ModItems.obsidian_stick);
		OreDictionary.registerOre("rodObsidian", ModItems.obsidian_stick);
		OreDictionary.registerOre("obsidianRod", ModItems.obsidian_stick);

		OreDictionary.registerOre("stickBlaze", Items.blaze_rod);
		OreDictionary.registerOre("rodBlaze", Items.blaze_rod);
		OreDictionary.registerOre("blazeRod", Items.blaze_rod);

		OreDictionary.registerOre("rodWood", Items.stick);
		OreDictionary.registerOre("woodRod", Items.stick);
		OreDictionary.registerOre("rodWooden", Items.stick);
		OreDictionary.registerOre("woodenRod", Items.stick);
	}
}
