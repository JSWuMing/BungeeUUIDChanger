package com.github.professorSam.bungeeUuidChanger;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin{

	@Override
	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerListener(this, new LoginListener());
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new UuidCommand());
		super.onEnable();
	}
}
