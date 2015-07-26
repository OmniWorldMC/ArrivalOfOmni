package com.omniworldmc.aom;

import com.omniworldmc.aom.listener.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class ArrivalOfOmni extends JavaPlugin {

    @Override
    public void onDisable() {

        this.getLogger().log(Level.INFO, "Disabled");
    }

    @Override
    public void onEnable() {

        new PlayerListener(this);
        this.getLogger().log(Level.INFO, "Enabled");
    }
}
