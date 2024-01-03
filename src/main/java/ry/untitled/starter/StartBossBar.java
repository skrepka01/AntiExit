package ry.untitled.starter;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class StartBossBar {

    private BossBar bossBar;
    public void bossBarStart(Player player)
    {
        bossBar = Bukkit.getServer().createBossBar("Вы находитесь в режиме ПВП", BarColor.PINK, BarStyle.SOLID);
        bossBar.setVisible(true);
        bossBar.addPlayer(player);
    }

    public BossBar getBossBar()
    {
        return bossBar;
    }
}
