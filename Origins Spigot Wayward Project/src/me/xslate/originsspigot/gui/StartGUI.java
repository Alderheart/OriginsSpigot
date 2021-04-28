package me.xslate.originsspigot.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.xslate.originsspigot.Main;

public class StartGUI implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			
			
			Inventory gui = Bukkit.createInventory(player, 27, Main.c("&b&lOrigins"));
			
			ItemStack placeholder = new ItemStack(Material.PAPER);
			ItemStack avian = new ItemStack(Material.FEATHER);
			ItemStack glass = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
			
			ItemStack[] menu_items = {glass, placeholder, null, placeholder, null, placeholder, null, placeholder, glass, glass, null, null, null, placeholder, null, null, null, glass, glass, placeholder, null, placeholder, null, placeholder, null, placeholder, glass};
			gui.setContents(menu_items);
			player.openInventory(gui);
		} return true;
	} 
}
