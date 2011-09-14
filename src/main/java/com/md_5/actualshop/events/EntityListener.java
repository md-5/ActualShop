package com.md_5.actualshop.events;

import com.md_5.actualshop.ActualShop;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.PluginManager;

public class EntityListener extends org.bukkit.event.entity.EntityListener {

    private final ActualShop plugin;

    public EntityListener(final ActualShop plugin) {
        this.plugin = plugin;
    }

    public void registerEvents(final PluginManager pm) {
        pm.registerEvent(Type.ENTITY_EXPLODE, this, Priority.Normal, plugin);
    }

    @Override
    public void onEntityExplode(EntityExplodeEvent event) {
    }
}
