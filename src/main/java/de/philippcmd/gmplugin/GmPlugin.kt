package de.philippcmd.gmplugin

import de.philippcmd.gmplugin.commands.gmCommand
import org.bukkit.plugin.java.JavaPlugin

class GmPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        getCommand("gm")!!.setExecutor(gmCommand())
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
