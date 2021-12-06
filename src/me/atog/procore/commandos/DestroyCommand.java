package me.atog.procore.commandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DestroyCommand implements CommandExecutor
{

    protected static String message;

    public DestroyCommand()
    {
        message = "&cHello friend, I just want to say good morning/evening, I want to tell you something, in my time, people always smiled, laughed, made faces, laughed their asses off and stuff, until the day came when they stopped doing that, why? I don't know, go ask them if you want to know, but well, leaving that topic aside, people keep saying: \"Hey but you're a gay subnormal\", and I tell them: \"Hello\", but well, the current generation is not better than before, leaving that aside, this command can destroy everything, even your computer, your server, your internet router, your house, the whole country, etc, it's like a nuclear bomb, be careful, if you want to run it you are accepting the risk, I will not be responsible for your actions, it was your decision so I will not hear complaints that: \"Hey atog socialism doesn't work\", \"Damn it atog I just murdered 5000 people because of you\", I will understand that you would be angry for executing the command, but executing it or not is at your own risk, have a nice day. Run &e/destroy confirm&c to proceed.";
    }

    @Override
    public boolean onCommand(CommandSender s, Command c, String n, String[] a)
    {

        if (a.length < 1)
        {
            s.sendMessage(message.replace('&', '�'));
            return true;
        }

        if (a[0] == "confirm")
        {
            s.sendMessage("&cI warned you...".replace('&', '�'));
            Bukkit.shutdown();
            System.exit(0);
        } else
        {
            s.sendMessage(message.replace('&', '�'));
            return true;
        }

        return true;
    }
}
