package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.blocks.BlockBlazeLadder;
import com.thedoctorsoda.sodacantorches.blocks.BlockFenceGateTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockFenceTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockLadderTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockLanternTDS;
import com.thedoctorsoda.sodacantorches.blocks.BlockObsidianLadder;
import com.thedoctorsoda.sodacantorches.blocks.BlockQuartzLadder;
import com.thedoctorsoda.sodacantorches.blocks.BlockTorchTDS;
import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.reference.Names;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public final class ModBlocks {
	public static final BlockTorchTDS stone_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.STONETORCH).setLightLevel(0.9375F).setBlockTextureName(Reference.MOD_ID + ":" + Names.STONETORCH);
	public static final BlockTorchTDS obsidian_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.OBSIDIANTORCH).setLightLevel(0.9375F).setResistance(6000F).setHardness(5F).setBlockTextureName(Reference.MOD_ID + ":" + Names.OBSIDIANTORCH);
	public static final BlockTorchTDS netherrack_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.NETHERRACKTORCH).setLightLevel(0.9375F).setBlockTextureName(Reference.MOD_ID + ":" + Names.NETHERRACKTORCH);
	public static final BlockTorchTDS quartz_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.QUARTZTORCH).setLightLevel(0.9375F).setBlockTextureName(Reference.MOD_ID + ":" + Names.QUARTZTORCH);
	public static final BlockTorchTDS bedrock_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.BEDROCKTORCH).setResistance(18000000F).setLightLevel(1F).setHardness(-1F).setBlockTextureName(Reference.MOD_ID + ":" + Names.BEDROCKTORCH);
	public static final BlockTorchTDS blaze_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.BLAZETORCH).setLightLevel(1F).setBlockTextureName(Reference.MOD_ID + ":" + Names.BLAZETORCH);
	public static final BlockTorchTDS bone_torch = (BlockTorchTDS) new BlockTorchTDS().setBlockName(Reference.MOD_ID + ":" + Names.BONETORCH).setLightLevel(0.5F).setBlockTextureName(Reference.MOD_ID + ":" + Names.BONETORCH);

	public static final BlockLadderTDS stone_ladder = (BlockLadderTDS) new BlockLadderTDS().setBlockName(Reference.MOD_ID + ":" + Names.STONELADDER).setHardness(0.4F).setBlockTextureName(Reference.MOD_ID + ":" + Names.STONELADDER);
	public static final BlockObsidianLadder obsidian_ladder = (BlockObsidianLadder) new BlockObsidianLadder().setBlockName(Reference.MOD_ID + ":" + Names.OBSIDIANLADDER).setHardness(5F).setResistance(6000F).setBlockTextureName(Reference.MOD_ID + ":" + Names.OBSIDIANLADDER);
	public static final BlockLadderTDS netherrack_ladder = (BlockLadderTDS) new BlockLadderTDS().setBlockName(Reference.MOD_ID + ":" + Names.NETHERRACKLADDER).setHardness(0.4F).setBlockTextureName(Reference.MOD_ID + ":" + Names.NETHERRACKLADDER);
	public static final BlockBlazeLadder blaze_ladder = (BlockBlazeLadder) new BlockBlazeLadder().setBlockName(Reference.MOD_ID + ":" + Names.BLAZELADDER).setHardness(0.4F).setBlockTextureName(Reference.MOD_ID + ":" + Names.BLAZELADDER);
	public static final BlockQuartzLadder quartz_ladder = (BlockQuartzLadder) new BlockQuartzLadder().setBlockName(Reference.MOD_ID + ":" + Names.QUARTZLADDER).setHardness(0.4F).setBlockTextureName(Reference.MOD_ID + ":" + Names.QUARTZLADDER);
	public static final BlockLadderTDS bedrock_ladder = (BlockLadderTDS) new BlockLadderTDS().setBlockName(Reference.MOD_ID + ":" + Names.BEDROCKLADDER).setResistance(18000000F).setHardness(-1F).setBlockTextureName(Reference.MOD_ID + ":" + Names.BEDROCKLADDER);

	public static final BlockLanternTDS wood_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.WOODLANTERN).setBlockName(Names.WOODLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS stone_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.STONELANTERN).setBlockName(Names.STONELANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS obsidian_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.OBSIDIANLANTERN).setBlockName(Names.OBSIDIANLANTERN).setResistance(6000F).setLightLevel(1F).setHardness(5F);
	public static final BlockLanternTDS netherrack_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.NETHERRACKLANTERN).setBlockName(Names.NETHERRACKLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS quartz_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.QUARTZLANTERN).setBlockName(Names.QUARTZLANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS blaze_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.BLAZELANTERN).setBlockName(Names.BLAZELANTERN).setResistance(13).setLightLevel(1F).setHardness(3);
	public static final BlockLanternTDS bedrock_lantern = (BlockLanternTDS) new BlockLanternTDS(Reference.MOD_ID + ":" + Names.BEDROCKLANTERN).setBlockName(Names.BEDROCKLANTERN).setResistance(18000000F).setLightLevel(1F).setHardness(-1);

	public static final BlockFenceTDS stone_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:stone", Material.rock).setBlockName(Names.STONEFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS obsidian_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:obsidian", Material.rock).setBlockName(Names.OBSIDIANFENCE).setResistance(6000F).setHardness(5F);
	public static final BlockFenceTDS netherrack_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:netherrack", Material.rock).setBlockName(Names.NETHERRACKFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS quartz_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:quartz_block_bottom", Material.rock).setBlockName(Names.QUARTZFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS blaze_fence = (BlockFenceTDS) new BlockFenceTDS(Reference.MOD_ID + ":blaze_fence_texture", Material.rock).setBlockName(Names.BLAZEFENCE).setResistance(13).setHardness(3);
	public static final BlockFenceTDS bedrock_fence = (BlockFenceTDS) new BlockFenceTDS("minecraft:bedrock", Material.rock).setBlockName(Names.BEDROCKFENCE).setResistance(18000000F).setHardness(-1);

	public static final BlockFenceGateTDS stone_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.stone).setBlockName(Names.STONEFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS obsidian_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.obsidian).setBlockName(Names.OBSIDIANFENCEGATE).setResistance(6000F).setHardness(5F);
	public static final BlockFenceGateTDS netherrack_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.netherrack).setBlockName(Names.NETHERRACKFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS quartz_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.quartz_stairs).setBlockName(Names.QUARTZFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS blaze_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(ModBlocks.blaze_fence).setBlockName(Names.BLAZEFENCEGATE).setResistance(13).setHardness(3);
	public static final BlockFenceGateTDS bedrock_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.bedrock).setBlockName(Names.BEDROCKFENCEGATE).setResistance(18000000F).setHardness(-1);

	public static final BlockFenceGateTDS netherbrick_fence_gate = (BlockFenceGateTDS) new BlockFenceGateTDS(Blocks.nether_brick).setBlockName(Names.NETHERBRICKFENCEGATE).setResistance(1).setHardness(3);

	public static final void init() {
		// Torches
		if (ConfigurationHandler.enableTorches) {
			if (ConfigurationHandler.enableStoneTorch) {
				GameRegistry.registerBlock(stone_torch, Names.STONETORCH);
			}
			if (ConfigurationHandler.enableObsidianTorch) {
				GameRegistry.registerBlock(obsidian_torch, Names.OBSIDIANTORCH);
			}
			if (ConfigurationHandler.enableNetherrackTorch) {
				GameRegistry.registerBlock(netherrack_torch, Names.NETHERRACKTORCH);
			}
			if (ConfigurationHandler.enableQuartzTorch) {
				GameRegistry.registerBlock(quartz_torch, Names.QUARTZTORCH);
			}
			if (ConfigurationHandler.enableBedrockTorch) {
				GameRegistry.registerBlock(bedrock_torch, Names.BEDROCKTORCH);
			}
			if (ConfigurationHandler.enableBlazeTorch) {
				GameRegistry.registerBlock(blaze_torch, Names.BLAZETORCH);
			}
			if (ConfigurationHandler.enableBoneTorch) {
				GameRegistry.registerBlock(bone_torch, Names.BONETORCH);
			}
		}

		// Ladders
		if (ConfigurationHandler.enableLadders) {
			if (ConfigurationHandler.enableStoneLadder) {
				GameRegistry.registerBlock(stone_ladder, Names.STONELADDER);
			}
			if (ConfigurationHandler.enableObsidianLadder) {
				GameRegistry.registerBlock(obsidian_ladder, Names.OBSIDIANLADDER);
			}
			if (ConfigurationHandler.enableNetherrackLadder) {
				GameRegistry.registerBlock(netherrack_ladder, Names.NETHERRACKLADDER);
			}
			if (ConfigurationHandler.enableQuartzLadder) {
				GameRegistry.registerBlock(quartz_ladder, Names.QUARTZLADDER);
			}
			if (ConfigurationHandler.enableBedrockLadder) {
				GameRegistry.registerBlock(bedrock_ladder, Names.BEDROCKLADDER);
			}
			if (ConfigurationHandler.enableBlazeLadder) {
				GameRegistry.registerBlock(blaze_ladder, Names.BLAZELADDER);
			}
		}

		// Lanterns
		if (ConfigurationHandler.enableLanterns) {
			if (ConfigurationHandler.enableWoodLantern) {
				GameRegistry.registerBlock(wood_lantern, Names.WOODLANTERN);
			}
			if (ConfigurationHandler.enableStoneLantern) {
				GameRegistry.registerBlock(stone_lantern, Names.STONELANTERN);
			}
			if (ConfigurationHandler.enableObsidianLantern) {
				GameRegistry.registerBlock(obsidian_lantern, Names.OBSIDIANLANTERN);
			}
			if (ConfigurationHandler.enableNetherrackLantern) {
				GameRegistry.registerBlock(netherrack_lantern, Names.NETHERRACKLANTERN);
			}
			if (ConfigurationHandler.enableQuartzLantern) {
				GameRegistry.registerBlock(quartz_lantern, Names.QUARTZLANTERN);
			}
			if (ConfigurationHandler.enableBedrockLantern) {
				GameRegistry.registerBlock(bedrock_lantern, Names.BEDROCKLANTERN);
			}
			if (ConfigurationHandler.enableBlazeLantern) {
				GameRegistry.registerBlock(blaze_lantern, Names.BLAZELANTERN);
			}

			// Fences
			if (ConfigurationHandler.enableFences) {
				if (ConfigurationHandler.enableStoneFence) {
					GameRegistry.registerBlock(stone_fence, Names.STONEFENCE);
					GameRegistry.registerBlock(stone_fence_gate, Names.STONEFENCEGATE);
				}
				if (ConfigurationHandler.enableObsidianFence) {
					GameRegistry.registerBlock(obsidian_fence, Names.OBSIDIANFENCE);
					GameRegistry.registerBlock(obsidian_fence_gate, Names.OBSIDIANFENCEGATE);
				}
				if (ConfigurationHandler.enableNetherrackFence) {
					GameRegistry.registerBlock(netherrack_fence, Names.NETHERRACKFENCE);
					GameRegistry.registerBlock(netherrack_fence_gate, Names.NETHERRACKFENCEGATE);
				}
				if (ConfigurationHandler.enableQuartzFence) {
					GameRegistry.registerBlock(quartz_fence, Names.QUARTZFENCE);
					GameRegistry.registerBlock(quartz_fence_gate, Names.QUARTZFENCEGATE);
				}
				if (ConfigurationHandler.enableBedrockFence) {
					GameRegistry.registerBlock(bedrock_fence, Names.BEDROCKFENCE);
					GameRegistry.registerBlock(bedrock_fence_gate, Names.BEDROCKFENCEGATE);
				}
				if (ConfigurationHandler.enableBlazeFence) {
					GameRegistry.registerBlock(blaze_fence, Names.BLAZEFENCE);
					GameRegistry.registerBlock(blaze_fence_gate, Names.BLAZEFENCEGATE);
				}
				if (ConfigurationHandler.enableNetherBrickFenceGate) {
					GameRegistry.registerBlock(netherbrick_fence_gate, Names.NETHERBRICKFENCEGATE);
				}
			}
		}
	}
}