package com.thedoctorsoda.sodacanutils;

import com.thedoctorsoda.sodacanutils.init.ModBlocks;
import com.thedoctorsoda.sodacanutils.init.ModItems;
import com.thedoctorsoda.sodacanutils.init.ModOreDictionary;
import com.thedoctorsoda.sodacanutils.init.ModRecipes;
import com.thedoctorsoda.sodacanutils.proxy.CommonProxy;
import com.thedoctorsoda.sodacanutils.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.RESOURCE_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class SodacanUtilities {
	@Mod.Instance(Reference.RESOURCE_ID)
	public static SodacanUtilities instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// ConfigurationHandler.init(event.getSuggestedConfigurationFile());

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