package com.thedoctorsoda.sodacantorches;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.init.ModBlocks;
import com.thedoctorsoda.sodacantorches.init.ModItems;
import com.thedoctorsoda.sodacantorches.init.ModOreDictionary;
import com.thedoctorsoda.sodacantorches.init.ModOverrides;
import com.thedoctorsoda.sodacantorches.init.ModRecipes;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class SodacanTorches {

	@Mod.Instance(Reference.MOD_ID)
	public static SodacanTorches instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		ModBlocks.init();
		ModItems.init();
	}

	@Mod.EventHandler
	public void Init(FMLPostInitializationEvent event) {
		ModRecipes.init();
		ModOreDictionary.init();
		ModOverrides.overrideVanilla();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}