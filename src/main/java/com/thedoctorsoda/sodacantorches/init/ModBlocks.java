package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.blocks.BlockBarsTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockDefaultLadderTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockEnderLadderTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockFenceGateTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockFenceTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockFlowerPotTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockLadderTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockLanternTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockLeverTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockTorchTDS;
import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.reference.Names;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public final class ModBlocks {
	public final static BlockFlowerPotTDS wood_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.WOODFLOWERPOT);
	public static final BlockFlowerPotTDS stone_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.STONEFLOWERPOT);
	public static final BlockFlowerPotTDS obsidian_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.OBSIDIANFLOWERPOT).setResistance(6000F).setHardness(5F);
	public static final BlockFlowerPotTDS netherrack_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.NETHERRACKFLOWERPOT);
	public static final BlockFlowerPotTDS netherbrick_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.NETHERBRICKFLOWERPOT);
	public static final BlockFlowerPotTDS quartz_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.QUARTZFLOWERPOT);
	public static final BlockFlowerPotTDS bedrock_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.BEDROCKFLOWERPOT).setResistance(18000000F).setHardness(-1F);
	public static final BlockFlowerPotTDS blaze_flowerpot = (BlockFlowerPotTDS) new BlockFlowerPotTDS().setBlockName(Names.BLAZEFLOWERPOT);

	public static final BlockTorchTDS stone_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.STONETORCH).setLightLevel(0.9375F);
	public static final BlockTorchTDS obsidian_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.OBSIDIANTORCH).setLightLevel(0.9375F).setResistance(6000F).setHardness(5F);
	public static final BlockTorchTDS netherrack_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.NETHERRACKTORCH).setLightLevel(0.9375F);
	public static final BlockTorchTDS netherbrick_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.NETHERBRICKTORCH).setLightLevel(0.9375F);
	public static final BlockTorchTDS quartz_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.QUARTZTORCH).setLightLevel(0.9375F);
	public static final BlockTorchTDS bedrock_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.BEDROCKTORCH).setResistance(18000000F).setLightLevel(1F).setHardness(-1F);
	public static final BlockTorchTDS blaze_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Names.BLAZETORCH).setLightLevel(1F);

	public static final BlockLeverTDS stone_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.STONELEVER);
	public static final BlockLeverTDS obsidian_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.OBSIDIANLEVER).setResistance(6000F).setHardness(5F);
	public static final BlockLeverTDS netherrack_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.NETHERRACKLEVER);
	public static final BlockLeverTDS netherbrick_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.NETHERBRICKLEVER);
	public static final BlockLeverTDS quartz_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.QUARTZLEVER);
	public static final BlockLeverTDS bedrock_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.BEDROCKLEVER).setResistance(18000000F).setHardness(-1F);
	public static final BlockLeverTDS blaze_lever = (BlockLeverTDS) new BlockLeverTDS().setBlockName(Names.BLAZELEVER);

	public static final BlockDefaultLadderTDS stone_ladder = (BlockDefaultLadderTDS) new BlockDefaultLadderTDS().setBlockName(Names.STONELADDER).setHardness(0.4F);
	public static final BlockEnderLadderTDS ender_ladder = (BlockEnderLadderTDS) new BlockEnderLadderTDS().setBlockName(Names.ENDERLADDER).setHardness(1F);
	public static final BlockLadderTDS obsidian_ladder = (BlockLadderTDS) new BlockLadderTDS(0.06F).setBlockName(Names.OBSIDIANLADDER).setHardness(5F).setResistance(6000F);
	public static final BlockDefaultLadderTDS netherrack_ladder = (BlockDefaultLadderTDS) new BlockDefaultLadderTDS().setBlockName(Names.NETHERRACKLADDER).setHardness(0.4F);
	public static final BlockLadderTDS blaze_ladder = (BlockLadderTDS) new BlockLadderTDS(0.1F).setBlockName(Names.BLAZELADDER).setHardness(0.4F);
	public static final BlockLadderTDS netherbrick_ladder = (BlockLadderTDS) new BlockLadderTDS(0.07F).setBlockName(Names.NETHERBRICKLADDER).setHardness(0.4F);
	public static final BlockLadderTDS quartz_ladder = (BlockLadderTDS) new BlockLadderTDS(0.06F).setBlockName(Names.QUARTZLADDER).setHardness(0.4F);
	public static final BlockDefaultLadderTDS bedrock_ladder = (BlockDefaultLadderTDS) new BlockDefaultLadderTDS().setBlockName(Names.BEDROCKLADDER).setResistance(18000000F).setHardness(-1F);

	public static final BlockLanternTDS wood_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.WOODLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS stone_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.STONELANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS obsidian_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.OBSIDIANLANTERN).setResistance(6000F).setLightLevel(1F).setHardness(5F);
	public static final BlockLanternTDS netherrack_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.NETHERRACKLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS netherbrick_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.NETHERBRICKLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS quartz_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.QUARTZLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS blaze_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.BLAZELANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS bedrock_lantern = (BlockLanternTDS) new BlockLanternTDS().setBlockName(Names.BEDROCKLANTERN).setResistance(18000000F).setLightLevel(1F).setHardness(-1);

	public static final BlockFenceTDS wood_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:planks_oak", Material.wood).setBlockName(Names.WOODFENCE).setResistance(15).setHardness(2);
	public static final BlockFenceTDS stone_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:stone", Material.rock).setBlockName(Names.STONEFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS obsidian_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:obsidian", Material.rock).setBlockName(Names.OBSIDIANFENCE).setResistance(6000F).setHardness(5F);
	public static final BlockFenceTDS netherrack_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:netherrack", Material.rock).setBlockName(Names.NETHERRACKFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS quartz_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:quartz_block_bottom", Material.rock).setBlockName(Names.QUARTZFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS blaze_fence = (BlockFenceTDS) new BlockFenceTDS(Reference.RESOURCE_ID + ":blaze_block", Material.rock).setBlockName(Names.BLAZEFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS netherbrick_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:nether_brick", Material.rock).setBlockName(Names.NETHERBRICKFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS bedrock_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:bedrock", Material.rock).setBlockName(Names.BEDROCKFENCE).setResistance(18000000F).setHardness(-1);

	public static final BlockFenceGateTDS stone_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.stone_fence).setBlockName(Names.STONEFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS obsidian_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.obsidian_fence).setBlockName(Names.OBSIDIANFENCEGATE).setResistance(6000F).setHardness(5F);
	public static final BlockFenceGateTDS netherrack_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.netherrack_fence).setBlockName(Names.NETHERRACKFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS quartz_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.quartz_fence).setBlockName(Names.QUARTZFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS blaze_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.blaze_fence).setBlockName(Names.BLAZEFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS bedrock_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.bedrock_fence).setBlockName(Names.BEDROCKFENCEGATE).setResistance(18000000F).setHardness(-1);
	public static final BlockFenceGateTDS netherbrick_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.netherbrick_fence).setBlockName(Names.NETHERBRICKFENCEGATE).setResistance(1).setHardness(3);

	public static final BlockBarsTDS gold_bars = (BlockBarsTDS) new BlockBarsTDS(Names.GOLDBARS, Material.iron, false).setBlockName(Reference.RESOURCE_ID + ":" + Names.GOLDBARS).setHardness(5).setResistance(30);
	public static final BlockBarsTDS diamond_bars = (BlockBarsTDS) new BlockBarsTDS(Names.DIAMONDBARS, Material.iron, false).setBlockName(Reference.RESOURCE_ID + ":" + Names.DIAMONDBARS).setHardness(5).setResistance(30);

	public static final BlockTDS logoblock = (BlockTDS) new BlockTDS().setBlockName("logoblock");

	public static final BlockTDS hardened_sand = (BlockTDS) new BlockTDS(Material.sand).setBlockName(Names.HARDENEDSAND);
	public static final BlockTDS sandy_brick = (BlockTDS) new BlockTDS(Material.sand).setBlockName(Names.SANDYBRICK);

	public static final BlockTDS blaze_block = (BlockTDS) new BlockTDS(Material.circuits).setBlockName(Names.BLAZEBLOCK);
	public static final BlockTDS charcoal_block = (BlockTDS) new BlockTDS(Material.rock).setBlockName(Names.CHARCOALBLOCK);

	public static final void init() {

		wood_flowerpot.fpItem = ModItems.wood_flowerpot;
		stone_flowerpot.fpItem = ModItems.stone_flowerpot;
		obsidian_flowerpot.fpItem = ModItems.obsidian_flowerpot;
		netherrack_flowerpot.fpItem = ModItems.netherrack_flowerpot;
		quartz_flowerpot.fpItem = ModItems.quartz_flowerpot;
		bedrock_flowerpot.fpItem = ModItems.bedrock_flowerpot;
		blaze_flowerpot.fpItem = ModItems.blaze_flowerpot;
		netherbrick_flowerpot.fpItem = ModItems.netherbrick_flowerpot;

		// Torches
		if (ConfigurationHandler.enableTorches) {
			GameRegistry.registerBlock(stone_torch, Names.STONETORCH);
			GameRegistry.registerBlock(obsidian_torch, Names.OBSIDIANTORCH);
			GameRegistry.registerBlock(netherrack_torch, Names.NETHERRACKTORCH);
			GameRegistry.registerBlock(quartz_torch, Names.QUARTZTORCH);
			GameRegistry.registerBlock(bedrock_torch, Names.BEDROCKTORCH);
			GameRegistry.registerBlock(blaze_torch, Names.BLAZETORCH);
			GameRegistry.registerBlock(netherbrick_torch, Names.NETHERBRICKTORCH);

		}

		// Flower Pot
		if (ConfigurationHandler.enableFlowerPots) {
			GameRegistry.registerBlock(wood_flowerpot, Names.WOODFLOWERPOT);
			GameRegistry.registerBlock(stone_flowerpot, Names.STONEFLOWERPOT);
			GameRegistry.registerBlock(obsidian_flowerpot, Names.OBSIDIANFLOWERPOT);
			GameRegistry.registerBlock(netherrack_flowerpot, Names.NETHERRACKFLOWERPOT);
			GameRegistry.registerBlock(quartz_flowerpot, Names.QUARTZFLOWERPOT);
			GameRegistry.registerBlock(bedrock_flowerpot, Names.BEDROCKFLOWERPOT);
			GameRegistry.registerBlock(blaze_flowerpot, Names.BLAZEFLOWERPOT);
			GameRegistry.registerBlock(netherbrick_flowerpot, Names.NETHERBRICKFLOWERPOT);
		}

		// Ladders
		if (ConfigurationHandler.enableLadders) {
			GameRegistry.registerBlock(stone_ladder, Names.STONELADDER);
			GameRegistry.registerBlock(obsidian_ladder, Names.OBSIDIANLADDER);
			GameRegistry.registerBlock(netherrack_ladder, Names.NETHERRACKLADDER);
			GameRegistry.registerBlock(quartz_ladder, Names.QUARTZLADDER);
			GameRegistry.registerBlock(bedrock_ladder, Names.BEDROCKLADDER);
			GameRegistry.registerBlock(blaze_ladder, Names.BLAZELADDER);
			GameRegistry.registerBlock(netherbrick_ladder, Names.NETHERBRICKLADDER);
			GameRegistry.registerBlock(ender_ladder, Names.ENDERLADDER);
		}

		// Levers
		if (ConfigurationHandler.enableLevers) {
			GameRegistry.registerBlock(stone_lever, Names.STONELEVER);
			GameRegistry.registerBlock(obsidian_lever, Names.OBSIDIANLEVER);
			GameRegistry.registerBlock(netherrack_lever, Names.NETHERRACKLEVER);
			GameRegistry.registerBlock(quartz_lever, Names.QUARTZLEVER);
			GameRegistry.registerBlock(bedrock_lever, Names.BEDROCKLEVER);
			GameRegistry.registerBlock(blaze_lever, Names.BLAZELEVER);
			GameRegistry.registerBlock(netherbrick_lever, Names.NETHERBRICKLEVER);
		}

		// Lanterns
		if (ConfigurationHandler.enableLanterns) {
			GameRegistry.registerBlock(wood_lantern, Names.WOODLANTERN);
			GameRegistry.registerBlock(stone_lantern, Names.STONELANTERN);
			GameRegistry.registerBlock(obsidian_lantern, Names.OBSIDIANLANTERN);
			GameRegistry.registerBlock(netherrack_lantern, Names.NETHERRACKLANTERN);
			GameRegistry.registerBlock(quartz_lantern, Names.QUARTZLANTERN);
			GameRegistry.registerBlock(bedrock_lantern, Names.BEDROCKLANTERN);
			GameRegistry.registerBlock(blaze_lantern, Names.BLAZELANTERN);
			GameRegistry.registerBlock(netherbrick_lantern, Names.NETHERBRICKLANTERN);
		}

		// Fences
		if (ConfigurationHandler.enableFences) {
			GameRegistry.registerBlock(wood_fence, Names.WOODFENCE);
			GameRegistry.registerBlock(stone_fence, Names.STONEFENCE);
			GameRegistry.registerBlock(stone_fence_gate, Names.STONEFENCEGATE);
			GameRegistry.registerBlock(obsidian_fence, Names.OBSIDIANFENCE);
			GameRegistry.registerBlock(obsidian_fence_gate, Names.OBSIDIANFENCEGATE);
			GameRegistry.registerBlock(netherrack_fence, Names.NETHERRACKFENCE);
			GameRegistry.registerBlock(netherrack_fence_gate, Names.NETHERRACKFENCEGATE);
			GameRegistry.registerBlock(quartz_fence, Names.QUARTZFENCE);
			GameRegistry.registerBlock(quartz_fence_gate, Names.QUARTZFENCEGATE);
			GameRegistry.registerBlock(bedrock_fence, Names.BEDROCKFENCE);
			GameRegistry.registerBlock(bedrock_fence_gate, Names.BEDROCKFENCEGATE);
			GameRegistry.registerBlock(blaze_fence, Names.BLAZEFENCE);
			GameRegistry.registerBlock(blaze_fence_gate, Names.BLAZEFENCEGATE);
			GameRegistry.registerBlock(netherbrick_fence, Names.NETHERBRICKFENCE);
			GameRegistry.registerBlock(netherbrick_fence_gate, Names.NETHERBRICKFENCEGATE);
		}

		// Bars
		if (ConfigurationHandler.enableBars) {
			GameRegistry.registerBlock(gold_bars, Names.GOLDBARS);
			GameRegistry.registerBlock(diamond_bars, Names.DIAMONDBARS);
		}

		GameRegistry.registerBlock(logoblock, Names.LOGOBLOCK);
		GameRegistry.registerBlock(hardened_sand, Names.HARDENEDSAND);
		GameRegistry.registerBlock(sandy_brick, Names.SANDYBRICK);

		GameRegistry.registerBlock(blaze_block, Names.BLAZEBLOCK);
		GameRegistry.registerBlock(charcoal_block, Names.CHARCOALBLOCK);
	}

	public static interface ISubBlocksBlock {

		Class<? extends ItemBlock> getItemBlockClass();
	}
}