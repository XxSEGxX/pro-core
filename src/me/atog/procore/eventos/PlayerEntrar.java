package me.atog.procore.eventos;

import me.atog.procore.ProCorePlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEntrar implements Listener {

    ProCorePlugin plugin;

    public PlayerEntrar(ProCorePlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void alEntrar(PlayerJoinEvent event) {
        FileConfiguration config = plugin.getConfig();

        if (config.getString("EVENTS.JOIN_EVENT.ENABLE").toUpperCase() == "TRUE") {
            event.setJoinMessage(null);

            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', config.getString("EVENTS.JOIN_EVENT.MESSAGE")));
            }
        } else {
            event.setJoinMessage(null);
        }
    }
}
