package ry.untitled;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ry.untitled.events.SetBossBar;
import ry.untitled.utils.HelperRegisters;

public final class Untitled extends JavaPlugin {


    public static Untitled instance;
    @Override
    public void onEnable() {
        instance = this;
        HelperRegisters.registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
