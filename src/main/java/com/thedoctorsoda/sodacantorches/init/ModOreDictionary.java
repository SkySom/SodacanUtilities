package com.thedoctorsoda.sodacantorches.init;

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
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.bedrock_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.stone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.quartz_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.blaze_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.obsidian_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.netherrack_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchAll", new ItemStack(ModBlocks.netherbrick_torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("torchRedstone", new ItemStack(Blocks.redstone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchBedrock", new ItemStack(ModBlocks.bedrock_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchStone", new ItemStack(ModBlocks.stone_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchQuartz", new ItemStack(ModBlocks.quartz_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchBlaze", new ItemStack(ModBlocks.blaze_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchObsidian", new ItemStack(ModBlocks.obsidian_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchNetherrack", new ItemStack(ModBlocks.netherrack_torch, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("torchNetherbrick", new ItemStack(ModBlocks.netherbrick_torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("torchWood", new ItemStack(Blocks.torch, 1, OreDictionary.WILDCARD_VALUE));

		OreDictionary.registerOre("stickAll", Items.stick);
		OreDictionary.registerOre("stickAll", Items.blaze_rod);
		OreDictionary.registerOre("stickAll", ModItems.stone_stick);
		OreDictionary.registerOre("stickAll", ModItems.netherrack_stick);
		OreDictionary.registerOre("stickAll", ModItems.obsidian_stick);
		OreDictionary.registerOre("stickAll", ModItems.quartz_stick);
		OreDictionary.registerOre("stickAll", ModItems.netherbrick_stick);
		OreDictionary.registerOre("stickAll", ModItems.ender_stick);

		OreDictionary.registerOre("stickStone", ModItems.stone_stick);
		OreDictionary.registerOre("rodStone", ModItems.stone_stick);
		OreDictionary.registerOre("stoneRod", ModItems.stone_stick);

		OreDictionary.registerOre("stickEnder", ModItems.ender_stick);
		OreDictionary.registerOre("rodEnder", ModItems.ender_stick);
		OreDictionary.registerOre("enderRod", ModItems.ender_stick);

		OreDictionary.registerOre("stickObsidian", ModItems.obsidian_stick);
		OreDictionary.registerOre("rodObsidian", ModItems.obsidian_stick);
		OreDictionary.registerOre("obsidianRod", ModItems.obsidian_stick);

		OreDictionary.registerOre("stickNetherrack", ModItems.netherrack_stick);
		OreDictionary.registerOre("rodNetherrack", ModItems.netherrack_stick);
		OreDictionary.registerOre("netherrackRod", ModItems.netherrack_stick);

		OreDictionary.registerOre("stickNetherbrick", ModItems.netherbrick_stick);
		OreDictionary.registerOre("rodNetherbrick", ModItems.netherbrick_stick);
		OreDictionary.registerOre("netherbrickRod", ModItems.netherbrick_stick);

		OreDictionary.registerOre("stickQuartz", ModItems.quartz_stick);
		OreDictionary.registerOre("rodQuartz", ModItems.quartz_stick);
		OreDictionary.registerOre("quartzRod", ModItems.quartz_stick);

		OreDictionary.registerOre("stickBlaze", Items.blaze_rod);
		OreDictionary.registerOre("rodBlaze", Items.blaze_rod);
		OreDictionary.registerOre("blazeRod", Items.blaze_rod);

		OreDictionary.registerOre("rodWood", Items.stick);
		OreDictionary.registerOre("woodRod", Items.stick);
		OreDictionary.registerOre("rodWooden", Items.stick);
		OreDictionary.registerOre("woodenRod", Items.stick);
	}
}
