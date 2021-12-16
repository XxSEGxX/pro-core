package me.atog.procore.commandos;

import com.sun.istack.internal.NotNull;
import me.atog.procore.ProCorePlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

import javax.annotation.Nullable;

public class MensajeGlobalCommand
implements CommandExecutor
{

    final static @NotNull @Nullable ProCorePlugin plugin = ProCorePlugin.getPlugin(ProCorePlugin.class);

    @Override
    public boolean onCommand(CommandSender a, Command b, String c, String[] d)
    {
        try
        {
            FileConfiguration config = plugin.getConfig();

            if (d.length <= 0)
            {
                a.sendMessage(config.getString("LANG.USAGES.BROADCAST_USAGE"));
            }
            else
            {
                String message = " ";
                for (int i = 0 ; i < c.length() ; i++)
                {
                    message = message + " " + d[i];
                }
                Bukkit.broadcastMessage(cambiarSimbolosDeColorAColoresEntendiblesPorElCodigo(config.getString("UTILS.BROADCAST_MESSAGE.PREFIX") + " " + message));
            }
        }
        catch (Exception e)
        {
            Bukkit.getLogger().info("Sorry, error in this :c");
            e.printStackTrace();
        }
        return false;
    }

    private String cambiarSimbolosDeColorAColoresEntendiblesPorElCodigo(String textoQueSeVaALeer)
    {
        return ChatColor.translateAlternateColorCodes('&', textoQueSeVaALeer);
    }
}
