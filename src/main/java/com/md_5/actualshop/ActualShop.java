package com.md_5.actualshop;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ActualShop extends JavaPlugin {

    public static final Logger logger = Bukkit.getServer().getLogger();

    public void onEnable() {
        logger.info("ActualShop has been enabled!");
    }

    public void onDisable() {
        logger.info("ActualShop has been disabled.");
    }
}