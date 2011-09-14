package com.md_5.actualshop.events;

import com.md_5.actualshop.ActualShop;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.PluginManager;

public class BlockListener extends org.bukkit.event.block.BlockListener {

    private final ActualShop plugin;

    public BlockListener(final ActualShop plugin) {
        this.plugin = plugin;
    }

    public void registerEvents(final PluginManager pm) {
        pm.registerEvent(Type.BLOCK_BREAK, this, Priority.Normal, plugin);
        pm.registerEvent(Type.BLOCK_PLACE, this, Priority.Normal, plugin);
        pm.registerEvent(Type.SIGN_CHANGE, this, Priority.Normal, plugin);
        pm.registerEvent(Type.BLOCK_PISTON_EXTEND, this, Priority.Normal, plugin);
        pm.registerEvent(Type.BLOCK_PISTON_RETRACT, this, Priority.Normal, plugin);
    }

    @Override
    public void onBlockBreak(BlockBreakEvent event) {
    }

    @Override
    public void onBlockPlace(BlockPlaceEvent event) {
    }

    @Override
    public void onSignChange(SignChangeEvent event) {
    }

    @Override
    public void onBlockPistonExtend(BlockPistonExtendEvent event) {
    }

    @Override
    public void onBlockPistonRetract(BlockPistonRetractEvent event) {
    }
}
