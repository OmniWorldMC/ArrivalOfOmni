package com.omniworldmc.aom.listener;

import com.omniworldmc.aom.ArrivalOfOmni;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    private final ArrivalOfOmni plugin;

    public PlayerListener(ArrivalOfOmni plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (player.getName().equals("omnixius")) {
            player.getWorld().setTime((long) 13250);
            int i = 0;
            while (i < 30) {
                player.getWorld().spawnEntity(player.getLocation(), EntityType.LIGHTNING);
                player.setHealth((double) 20);
                i++;
            }
            for (Player p : Bukkit.getOnlinePlayers()) {
                p.playSound(p.getLocation(), Sound.NOTE_BASS, 10, 10);
            }
        }
    }
}
