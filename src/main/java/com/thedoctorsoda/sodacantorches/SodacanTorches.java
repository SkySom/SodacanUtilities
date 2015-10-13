package com.thedoctorsoda.sodacantorches;

import com.thedoctorsoda.sodacantorches.configuration.ConfigurationHandler;
import com.thedoctorsoda.sodacantorches.init.ModBlocks;
import com.thedoctorsoda.sodacantorches.init.ModItems;
import com.thedoctorsoda.sodacantorches.init.ModOreDictionary;
import com.thedoctorsoda.sodacantorches.init.ModRecipes;
import com.thedoctorsoda.sodacantorches.proxy.CommonProxy;
import com.thedoctorsoda.sodacantorches.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.RESOURCE_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class SodacanTorches {
	@Mod.Instance(Reference.RESOURCE_ID)
	public static SodacanTorches instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());

		ModBlocks.init();
		ModItems.init();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		ModRecipes.init();
		ModOreDictionary.init();

		proxy.init(event);

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}