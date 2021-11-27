package me.atog.procore;

import me.atog.procore.eventos.PlayerEntrar;

import java.io.File;

public class ProCorePlugin2 {

	private static String rutaConfig;

	public static void onEnable(ProCorePlugin plugin) {
		System.out.print("&aPlugin enabled".replace('&', '§'));
		plugin.registerCommandos();
		plugin.getServer().getPluginManager().registerEvents(new PlayerEntrar(plugin), plugin);
		registerConfig(plugin);
	}
	
	public static void onDisable(ProCorePlugin plugin) {
		System.out.print("&cPlugin disabled".replace('&', '§'));
	}

	public static void registerConfig(ProCorePlugin plugin) {
		File configFile = new File(plugin.getDataFolder(), "config.yml");
		rutaConfig = configFile.getPath();
		if(!configFile.exists()) {
			plugin.getConfig().options().copyDefaults(true);
			plugin.saveConfig();
		}



	}
}
