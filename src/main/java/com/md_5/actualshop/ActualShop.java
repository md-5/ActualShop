package com.md_5.actualshop;

import com.md_5.actualshop.events.EntityListener;
import com.md_5.actualshop.events.BlockListener;
import com.md_5.actualshop.events.PlayerListener;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ActualShop extends JavaPlugin {

    static final Logger logger = Bukkit.getServer().getLogger();

    public void onEnable() {

        PluginManager pm = this.getServer().getPluginManager();

        BlockListener blockListener = new BlockListener(this);
        blockListener.registerEvents(pm);

        EntityListener entityListener = new EntityListener(this);
        entityListener.registerEvents(pm);

        PlayerListener playerListener = new PlayerListener(this);
        playerListener.registerEvents(pm);
        
        logger.info(String.format("ActualShop v%1$s enabled", this.getDescription().getVersion()));
    }

    public void onDisable() {
        logger.info(String.format("ActualShop v%1$s disabled", this.getDescription().getVersion()));
    }
}