package me.atog.procore;

import com.sun.istack.internal.NotNull;
import me.atog.procore.eventos.PlayerEntrar;

import java.io.File;

public class ProCorePlugin2 {

	private static String rutaConfig;

	public final static void onEnable(@NotNull ProCorePlugin plugin) {
		System.out.print("&aPlugin enabled".replace('&', '§'));
		plugin.registerCommandos();
		plugin.getServer().getPluginManager().registerEvents(new PlayerEntrar(plugin), plugin);
		registerConfig(plugin);
	}

	public final static void onDisable(@NotNull ProCorePlugin plugin) {
		System.out.print("&cPlugin disabled".replace('&', '§'));
	}

	public final static void registerConfig(@NotNull ProCorePlugin plugin) {
		File configFile = new File(plugin.getDataFolder(), "config.yml");
		rutaConfig = configFile.getPath();
		if(!configFile.exists()) {
			plugin.getConfig().options().copyDefaults(true);
			plugin.saveConfig();
		}



	}
}
