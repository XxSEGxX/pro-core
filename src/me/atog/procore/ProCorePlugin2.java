package me.atog.procore;

public class ProCorePlugin2 {
	public final static void onEnable(ProCorePlugin plugin) {
		System.out.print("&aPlugin enabled".replace('&', '§'));
		plugin.registerCommandos();
	}
	
	public final static void onDisable(ProCorePlugin plugin) {
		System.out.print("&cPlugin disabled".replace('&', '§'));
	}
}
