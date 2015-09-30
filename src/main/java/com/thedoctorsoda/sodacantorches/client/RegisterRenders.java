package com.thedoctorsoda.sodacantorches.client;

import com.thedoctorsoda.sodacantorches.client.renderer.item.BedrockFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.BedrockLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.BlazeFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.BlazeLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.FlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.NetherbrickFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.NetherbrickLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.NetherrackFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.NetherrackLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.ObsidianFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.ObsidianLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.QuartzFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.QuartzLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.StoneFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.StoneLeverRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.TorchRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.WoodFlowerPotRender;
import com.thedoctorsoda.sodacantorches.client.renderer.item.WoodLeverRender;
import com.thedoctorsoda.sodacantorches.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bone_torch), new TorchRender());

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Blocks.lever), new WoodLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bedrock_lever), new BedrockLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.blaze_lever), new BlazeLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherbrick_lever), new NetherbrickLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherrack_lever), new NetherrackLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.obsidian_lever), new ObsidianLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.quartz_lever), new QuartzLeverRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.stone_lever), new StoneLeverRender());

		MinecraftForgeClient.registerItemRenderer(Items.flower_pot, new FlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.wood_flowerpot), new WoodFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.bedrock_flowerpot), new BedrockFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.blaze_flowerpot), new BlazeFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherbrick_flowerpot), new NetherbrickFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.netherrack_flowerpot), new NetherrackFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.obsidian_flowerpot), new ObsidianFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.quartz_flowerpot), new QuartzFlowerPotRender());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.stone_flowerpot), new StoneFlowerPotRender());
	}
}
