package me.atog.procore;

public class ProCorePlugin2 {
	public static void onEnable(ProCorePlugin plugin) {
		System.out.print("&aPlugin enabled".replace('&', '§'));
		plugin.registerCommandos();
	}
	
	public static void onDisable(ProCorePlugin plugin) {
		System.out.print("&cPlugin disabled".replace('&', '§'));
	}
}
