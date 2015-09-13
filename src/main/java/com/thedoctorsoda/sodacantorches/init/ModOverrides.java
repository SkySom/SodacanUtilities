package com.thedoctorsoda.sodacantorches.init;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class ModOverrides {
	public static void overrideVanilla() {
		if (ConfigurationHandler.overrideVanillaTextures) {
			Items.stick.setTextureName(Reference.MOD_ID + ":overrideVanilla/stick");
			Blocks.torch.setBlockTextureName(Reference.MOD_ID + ":overrideVanilla/wood_torch");
			Blocks.redstone_torch.setBlockTextureName(Reference.MOD_ID + ":overrideVanilla/redstone_torch_on");
			Blocks.unlit_redstone_torch.setBlockTextureName(Reference.MOD_ID + ":overrideVanilla/redstone_torch_off");
			Blocks.ladder.setBlockTextureName(Reference.MOD_ID + ":overrideVanilla/wood_ladder");
		}
	}
}
