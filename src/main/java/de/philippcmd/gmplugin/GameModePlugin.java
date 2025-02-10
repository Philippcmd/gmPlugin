package de.philippcmd.gmplugin;

import de.philippcmd.gmplugin.commands.gmCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class GameModePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command and pass 'this' (the plugin instance) to the constructor
        this.getCommand("gm").setExecutor(new gmCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}