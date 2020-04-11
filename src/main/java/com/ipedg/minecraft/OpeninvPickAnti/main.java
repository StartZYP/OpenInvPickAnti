package com.ipedg.minecraft.OpeninvPickAnti;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("[潜影盒阻止丢弃已开启]");
        Bukkit.getServer().getPluginManager().registerEvents(this,this);
        super.onEnable();
    }

    @EventHandler
    public void PlayerPickEvent(PlayerDropItemEvent event){
        InventoryView openInventory = event.getPlayer().getOpenInventory();
        if (openInventory.getType()== InventoryType.SHULKER_BOX){
            event.getItemDrop().setItemStack(null);
        }
    }
}
