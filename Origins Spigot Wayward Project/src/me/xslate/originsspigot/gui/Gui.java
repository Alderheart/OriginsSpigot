package me.xslate.originsspigot.gui;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import me.xslate.originsspigot.Main;

public class Gui implements CommandExecutor {
	

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	
		if(sender instanceof Player) {
			Player player = (Player) sender;
		 
				System.out.println("1");
			
					Inventory gui = Bukkit.createInventory(player, 9, ChatColor.DARK_RED + "Server GUI");
		
					
					ItemStack arrow = new ItemStack(Material.ARROW);
					ItemStack avian = new ItemStack(Material.FEATHER);
		
		
					ItemMeta arrowmeta = arrow.getItemMeta();
					arrowmeta.setDisplayName(Main.c("&7&oNext Page"));
					ArrayList<String> arrowlore = new ArrayList<>();
					arrowlore.add(Main.c("&7&oPage 2"));
					arrowmeta.setLore(arrowlore);
					arrow.setItemMeta(arrowmeta);
		
		
					ItemMeta avianmeta = avian.getItemMeta();
					avianmeta.setDisplayName(Main.c("&f&lAvian"));
					ArrayList<String> avianlore = new ArrayList<>();
					avianlore.add(Main.c("&7Permanent slow falling"));
					avianlore.add(Main.c("&7Permanet Speed 1"));
					avianlore.add(Main.c("&7Can only sleep at Y86 or higher"));
					avianlore.add(Main.c("&7Vegetarin"));
					avianmeta.setLore(avianlore);
					avian.setItemMeta(avianmeta);
		
					System.out.println("2");
					ItemStack[] menu_items = {null, null};
					gui.setContents(menu_items);
					player.openInventory(gui);
					System.out.println("3");
				}	
	
		System.out.println("4");
		return true;
	}

	}