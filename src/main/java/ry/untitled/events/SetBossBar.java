package ry.untitled.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import ry.untitled.starter.StartBossBar;
import ry.untitled.utils.StartScheduler;

public class SetBossBar implements Listener {

    public boolean isPvp = false;
    private final StartScheduler scheduler = new StartScheduler();

    @EventHandler
    public void renderBossBar(EntityDamageByEntityEvent event)
    {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            isPvp = true;
            StartBossBar start = new StartBossBar();
            if (!scheduler.getStartBar())
            {
                start.bossBarStart(player);
                scheduler.canselBossBar(start.getBossBar());
            }else player.sendMessage("ssssss");

        }
    }

    @EventHandler
    public void exitPlayer(PlayerQuitEvent event){
        if (isPvp && scheduler.getStartBar())
        {
            Player player = event.getPlayer();
            killPlayer(player);
        }
    }

    private void killPlayer(Player player)
    {
        player.setHealth(0.0);
    }
}
