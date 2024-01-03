package ry.untitled.utils;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import ry.untitled.Untitled;

public class StartScheduler {

    private static boolean isStartBossBar = false;
    public void canselBossBar(BossBar bossBar){
        isStartBossBar = true;
        System.out.println("true");
        new BukkitRunnable() {
            @Override
            public void run() {
                bossBar.setVisible(false);
                bossBar.removeAll();
                isStartBossBar = false;
                System.out.println("false");
            }
        }.runTaskLater(Untitled.instance,200);
    }

    public boolean getStartBar()
    {
        return isStartBossBar;
    }
}
