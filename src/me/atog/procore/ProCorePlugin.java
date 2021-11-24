package me.atog.procore;

import org.bukkit.plugin.java.JavaPlugin;

import me.atog.procore.commandos.GameModeCommand;

public class ProCorePlugin extends JavaPlugin {
	
	public void onEnable() {
		ProCorePlugin2.onEnable(this);
	}
	
	public void onDisable() {
		ProCorePlugin2.onDisable(this);
	}
	
	public final void registerCommandos() {
		getCommand("gm").setExecutor(new GameModeCommand());
	}
	
}
