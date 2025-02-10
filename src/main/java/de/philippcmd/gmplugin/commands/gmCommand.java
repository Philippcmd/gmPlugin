package de.philippcmd.gmplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class gmCommand implements CommandExecutor {

    private final JavaPlugin plugin;

    // Constructor to pass the plugin instance
    public gmCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("Usage: /gm <1|2|3|4>");
            return true;
        }

        int mode;
        try {
            mode = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            player.sendMessage("Invalid game mode. Use 1 for Creative, 2 for Survival, 3 for Adventure, 4 for Spectator.");
            return true;
        }

        GameMode gameMode;
        switch (mode) {
            case 1:
                gameMode = GameMode.CREATIVE;
                break;
            case 2:
                gameMode = GameMode.SURVIVAL;
                break;
            case 3:
                gameMode = GameMode.ADVENTURE;
                break;
            case 4:
                gameMode = GameMode.SPECTATOR;
                break;
            default:
                player.sendMessage("Invalid game mode. Use 1 for Creative, 2 for Survival, 3 for Adventure, 4 for Spectator.");
                return true;
        }

        player.setGameMode(gameMode);
        player.sendMessage("Your game mode has been updated to " + gameMode.name());
        return true;
    }
}