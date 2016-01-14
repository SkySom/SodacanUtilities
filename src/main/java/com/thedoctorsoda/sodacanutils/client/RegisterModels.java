package com.thedoctorsoda.sodacanutils.client;

import com.thedoctorsoda.sodacanutils.init.ModBlocks;
import com.thedoctorsoda.sodacanutils.init.ModItems;
import com.thedoctorsoda.sodacanutils.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RegisterModels {
	public static void registerModels() {
		registerItems();
		registerBlocks();
	}

	private static void registerItems() {
		regItem(ModItems.golden_water_bucket);
		regItem(ModItems.stone_stick);
		regItem(ModItems.obsidian_stick);
	}

	private static void registerBlocks() {
		regBlock(ModBlocks.stone_torch);
		regBlock(ModBlocks.obsidian_torch);

		regBlock(ModBlocks.wooden_lantern);
		regBlock(ModBlocks.stone_lantern);
		regBlock(ModBlocks.obsidian_lantern);
		regBlock(ModBlocks.quartz_lantern);
		regBlock(ModBlocks.netherbrick_lantern);
	}

	public static void regBlock(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName().substring(5), "inventory"));
	}

	private static void regItem(Item item, int metadata) {
		LogHelper.info("Registering model for: " + item.getUnlocalizedName().substring(5));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
	}

	private static void regItem(Item item) {
		regItem(item, 0);
	}
}
