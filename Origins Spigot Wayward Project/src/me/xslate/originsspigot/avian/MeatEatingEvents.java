package me.xslate.originsspigot.avian;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;


public class MeatEatingEvents implements Listener {
	
	@EventHandler
	public void onConsume(PlayerItemConsumeEvent event) {
		//if (class = "Avian") {
			if (event.getItem().getType() == Material.COOKED_BEEF || event.getItem().getType() == Material.COOKED_CHICKEN || event.getItem().getType() == Material.CHICKEN 
					|| event.getItem().getType() == Material.BEEF || event.getItem().getType() == Material.COOKED_COD|| event.getItem().getType() == Material.COD 
					|| event.getItem().getType() == Material.COOKED_MUTTON || event.getItem().getType() == Material.MUTTON || event.getItem().getType() == Material.COOKED_PORKCHOP
					|| event.getItem().getType() == Material.PORKCHOP || event.getItem().getType() == Material.COOKED_RABBIT || event.getItem().getType() == Material.RABBIT 
					|| event.getItem().getType() == Material.COOKED_SALMON || event.getItem().getType() == Material.SALMON) {
				event.setCancelled(true);
			}
		}
	}
