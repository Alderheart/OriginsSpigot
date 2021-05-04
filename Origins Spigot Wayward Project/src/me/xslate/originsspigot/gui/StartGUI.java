package me.xslate.originsspigot.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.xslate.originsspigot.Main;

public class StartGUI implements CommandExecutor {
	
	
	public Inventory inventory;

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (label.equalsIgnoreCase("origins")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Only a player may execute this command!");
				return true;
			}
			createInventory();
			Player player = (Player) sender;
			player.openInventory(inventory); // error here
			return true;
			
		}
		return false;
	}
	
	public void createInventory() {
		
		inventory = Bukkit.createInventory(null, 27, Main.c("&c&lOrigin"));
		
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName("");
		item.setItemMeta(meta);
		inventory.setItem(0, item);
		
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(1, item);
		
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(3, item);
		
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(5, item);
		
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(7, item);
		
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName(null);
		item.setItemMeta(meta);
		inventory.setItem(8, item);
		
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName(null);
		item.setItemMeta(meta);
		inventory.setItem(9, item);
		
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(13, item);
		
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName(null);
		item.setItemMeta(meta);
		inventory.setItem(17, item);
		
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName(null);
		item.setItemMeta(meta);
		inventory.setItem(18, item);
				
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(19, item);
				
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(21, item);
				
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(23, item);
				
		//Placeholder
		item.setType(Material.PAPER);
		meta.setDisplayName(Main.c("&5&oPlaceholder"));
		item.setItemMeta(meta);
		inventory.setItem(25, item);
				
		//Glass
		item.setType(Material.BLACK_STAINED_GLASS_PANE);
		meta.setDisplayName(null);
		item.setItemMeta(meta);
		inventory.setItem(26, item);
		
				
				
				
	}
	

}
