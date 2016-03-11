package com.cnaude.trophyheads;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author cnaude
 */
public class ReloadCommand implements CommandExecutor {

    private final TrophyHeads plugin;

    public ReloadCommand(TrophyHeads plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (sender.hasPermission("trophyheads.reload")) {
            plugin.loadTrophyConfig(sender);
        } else {
            sender.sendMessage(ChatColor.RED + "You do not have permission to run this command.");
        }
        return true;
    }
}
