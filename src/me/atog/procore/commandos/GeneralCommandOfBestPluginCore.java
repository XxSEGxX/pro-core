package me.atog.procore.commandos;

import me.atog.procore.api.ProCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GeneralCommandOfBestPluginCore implements ProCommand {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		
		arg0.sendMessage("Hello world!");
		
		return false;
	}

}
