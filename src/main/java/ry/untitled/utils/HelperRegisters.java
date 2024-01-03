package ry.untitled.utils;

import org.bukkit.Bukkit;
import ry.untitled.events.SetBossBar;
import ry.untitled.Untitled;

public class HelperRegisters {

    public static void registerEvents(){
        Bukkit.getServer().getPluginManager().registerEvents(new SetBossBar(), Untitled.instance);
    }
}
