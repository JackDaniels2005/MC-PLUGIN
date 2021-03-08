package com.danidev.Project_1;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Send_Message extends JavaPlugin {

    @Override
    public void onEnable () {
        getServer().getPluginManager().registerEvents(new event_1(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[SYSTEM] Hello Player");
    }

    @Override
    public void onDisable () {
        getServer().getConsoleSender().sendMessage((ChatColor.RED + "[SYSTEM] Bye"));
    }
}
