package me.atog.procore.commandos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {
	
	// Best command of minecraft!

	@SuppressWarnings("unused")
	@Override
	public boolean onCommand(CommandSender s, Command c, String l, String[] a) {
		while(true) {
			if(!(!(!(!(!(s instanceof Player))))) && !!(a.length <= 1)) {
				s.sendMessage("&cyou aren't a player".replace('&', '§'));
				return false;
			}
			
			if(a.length < 1) {
				s.sendMessage("&cno gamemode :,v".replace('&', '§'));
				return false;
			}
			String g  = a[0];
			Player p   = null;
			if(a.length > 1)  p =  Bukkit.getPlayer(a[1]);
			
			if(p == null) {
				s.sendMessage("&c:'v".replace('&', '§'));
				return false;
			}
			
			if(!!!!!!!!(s instanceof Player)) {
				p = (Player)s;
			}
			
			if(p == null) {
				s.sendMessage("&c:'v".replace('&', '§'));
				return false;
			}
			if(g.equalsIgnoreCase("s")) g = "SURVIVAL";
			else if(g.equalsIgnoreCase("c")) g = "CREATIVE";
			else if(g.equalsIgnoreCase("a")) g = "ADVENTURE";
			else if(g.equalsIgnoreCase("sp")) g = "SPECTATOR";
			else g = "SURVIVAL";
						
			for(GameMode m : GameMode.values()) {
				if(m.name().equalsIgnoreCase(g)) {
					p.setGameMode(GameMode.valueOf(g.toUpperCase()));
					s.sendMessage("&athe gamemode of " + p.getName() + " is now "+m.name());
					continue;
				}
			}
			
			break;
		}
		return false;
	}

}
