package com.thedoctorsoda.sodacantorches;

import com.thedoctorsoda.sodacantorches.utility.LogHelper;

import cpw.mods.fml.common.gameevent.PlayerEvent;

public class SodacanEvent {
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		LogHelper.info("test");
	}
}