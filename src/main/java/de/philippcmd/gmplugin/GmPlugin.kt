package de.philippcmd.gmplugin;

import de.philippcmd.gmplugin.commands.gmCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class GmPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("gm").setExecutor(new gmCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
