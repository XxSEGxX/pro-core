package me.atog.procore.eventos;

import com.sun.istack.internal.NotNull;
import me.atog.procore.ProCorePlugin;
import me.atog.procore.api.Event;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEntrar implements Event
{

    final ProCorePlugin plugin;

    public PlayerEntrar(@NotNull ProCorePlugin plugin)
    {
        this.plugin = plugin;
    }

    @NotNull
    @EventHandler
    public final void alEntrar(@NotNull final PlayerJoinEvent event)
    {
    	new Thread()
        {
    		public void run()
            {
    			FileConfiguration config = plugin.getConfig();
        		if (config.getString("EVENTS.JOIN_EVENT.ENABLE").toString().toUpperCase() == "TRUE")
                {
                    event.setJoinMessage(null);

                    for (Player player : Bukkit.getOnlinePlayers())
                    {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', cambioColor(config.getString("EVENTS.JOIN_EVENT.MESSAGE"))));
                    }
                } else
                {
                    event.setJoinMessage(null);
                }
    		}
    	};
    }

    @NotNull
    private String cambioColor(@NotNull final String texto)
    {
        return ChatColor
                .translateAlternateColorCodes(
                        '&', texto.toString()
                );

    }
}
