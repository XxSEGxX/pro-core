package me.atog.procore.commandos;

import me.atog.procore.api.ProCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.logging.Level;

public class PluginCommandFlyMode
    implements ProCommand
{

    boolean mode_fly = false;

    @Override
    public boolean onCommand(CommandSender s, Command c, String string, String[] args)
    {
        mode_fly = false    ;
        String no_permission = "You dont have permissions :''v";

        if (!(s instanceof Player))
        {
            String no_console = "you cant use this function used to execute preset actions by placing a text in the server console";
            Level info = Level.INFO;

            s.getServer().getLogger().log(info, no_console);
            return true;
        } else
        {

            Player p = (Player)s;

            if (p.hasPermission("pro-core.command.fly"))
            {

                if (args.length == 0)
                {

                    if(mode_fly == true)
                    {

                        mode_fly = false;
                        if (p.getAllowFlight())
                        {
                            if (p.isFlying())
                            {
                                p.setAllowFlight(false);
                                p.setFlying(false);
                            }
                        } else
                        {
                            if (p.isFlying())
                            {
                                p.setAllowFlight(false);
                                p.setFlying(false);
                            }
                        }
                        return true;
                    } else
                    {
                        if (p.getAllowFlight())
                        {
                            if (p.isFlying())
                            {
                                p.setAllowFlight(false);
                                p.setFlying(false);
                            }
                        } else
                        {
                            if (p.isFlying())
                            {
                                p.setAllowFlight(false);
                                p.setFlying(false);
                            }
                        }
                        return true;
                    }
                }
                return true;
            } else
            {
                p.sendMessage(no_permission);
            }
        }
        return false;
    }
}
