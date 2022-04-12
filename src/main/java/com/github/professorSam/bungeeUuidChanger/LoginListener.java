package com.github.professorSam.bungeeUuidChanger;

import java.util.HashMap;
import java.util.UUID;

import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

public class LoginListener implements Listener {
	public static HashMap<String, UUID> playerAndUuids = new HashMap<>();
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerLoginEvent(PreLoginEvent event) {
		if(!playerAndUuids.containsKey(event.getConnection().getName())) {
			return;
		}
		event.getConnection().setUniqueId(playerAndUuids.get(event.getConnection().getName()));
	}
}	
