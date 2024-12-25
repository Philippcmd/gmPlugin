package de.philippcmd.gmplugin.commands

import org.bukkit.GameMode
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class gmCommand : CommandExecutor {
    override fun onCommand(commandSender: CommandSender, command: Command, s: String, strings: Array<String>): Boolean {
        if (commandSender !is Player) {
            commandSender.sendMessage("This command can only be executed by a player!")
            return false
        }
        val player = commandSender
        if (strings.size == 1) {
            if (strings[0].equals("1" , ignoreCase = true)) {
                player.gameMode = GameMode.CREATIVE
                player.sendMessage("You are now in Creative mode")
            } else if (strings[0].equals("2", ignoreCase = true)) {
                player.gameMode = GameMode.SURVIVAL
                player.sendMessage("You are now in Survival mode")
            } else if (strings[0].equals("3", ignoreCase = true)) {
                player.gameMode = GameMode.ADVENTURE
                player.sendMessage("You are now in Adventure mode")
            } else if (strings[0].equals("4", ignoreCase = true)) {
                player.gameMode = GameMode.SPECTATOR
                player.sendMessage("You are now in Spectator mode")
            } else {
                player.sendMessage("Usage: /gm <1|2|3|4>")
            }
        } else {
            player.sendMessage("Usage: /gm <1|2|3|4>")
        }
        return true
    }
}
