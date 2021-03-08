package com.danidev.Project_1;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class event_1 implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String name = player.getName();
        player.sendMessage(ChatColor.GREEN + "welcome " + name);
        player.setGameMode(GameMode.SURVIVAL);
    }

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY()-1;
        int z = player.getLocation().getBlockZ();
        ItemStack dia = new ItemStack(Material.DIAMOND);

        Material block = player.getWorld().getBlockAt(x,y,z).getType();
        if(block == Material.STONE) {
            player.sendMessage(ChatColor.RED + "You are standing on Stone");
        }

        if(player.getHealth() < 18) {
            Inventory inv = player.getInventory();
            inv.addItem(dia);
        }
    }

    @EventHandler
    public static void onPlayerEggThrow(PlayerEggThrowEvent e) {
        Player player = e.getPlayer();
        Inventory inv = player.getInventory();
        inv.addItem(new ItemStack(Material.DIAMOND));
    }
}
