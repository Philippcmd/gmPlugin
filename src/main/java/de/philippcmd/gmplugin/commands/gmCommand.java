package de.philippcmd.gmplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            commandSender.sendMessage("This command can only be executed by a player!");
            return false;
        }
        Player player = (Player) commandSender;

        if (strings.length == 1) {
            if (strings[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("You are now in Creative mode");
            } else if (strings[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("You are now in Survival mode");
            } else if (strings[0].equalsIgnoreCase("3")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("You are now in Adventure mode");
            } else if (strings[0].equalsIgnoreCase("4")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("You are now in Spectator mode");
            } else {
                player.sendMessage("Usage: /gm <1|2|3|4>");
            }

        }else {
            player.sendMessage("Usage: /gm <1|2|3|4>");
        }
        return false;
    }
}
