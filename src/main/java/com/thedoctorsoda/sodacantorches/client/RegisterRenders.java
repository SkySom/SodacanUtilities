package com.thedoctorsoda.sodacantorches.client;

import com.thedoctorsoda.sodacantorches.client.renderer.item.TorchRender;
import com.thedoctorsoda.sodacantorches.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class RegisterRenders {
	public static void init() {
		registerItemRenderers();
	}

	public static void registerItemRenderers() {
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.redstone_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.stone_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.obsidian_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherrack_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.quartz_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherbrick_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bedrock_torch), new TorchRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.blaze_torch), new TorchRender());
	}
}
