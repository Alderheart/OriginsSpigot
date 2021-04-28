package me.xslate.originsspigot.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.xslate.originsspigot.Main;

public class ClickEvents implements Listener {
	
	@EventHandler
	public void clickEvent(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		
		if (event.getView().getTitle().equalsIgnoreCase(Main.c("&b&lOrigins"))) {
			
			switch (event.getCurrentItem().getType()) {
			case PAPER:
				player.closeInventory();
				break;
				
				
			}
			event.setCancelled(true);
		}
	}

}
