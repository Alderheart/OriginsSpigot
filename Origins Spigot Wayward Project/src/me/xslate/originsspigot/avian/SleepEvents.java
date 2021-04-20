package me.xslate.originsspigot.avian;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SleepEvents implements Listener {
	
	@EventHandler
	public void onRightClickWhite(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (event.getClickedBlock().getType() == Material.WHITE_BED || event.getClickedBlock().getType() == Material.YELLOW_BED|| event.getClickedBlock().getType() == Material.RED_BED 
					|| event.getClickedBlock().getType() == Material.PURPLE_BED || event.getClickedBlock().getType() == Material.PINK_BED || event.getClickedBlock().getType() == Material.ORANGE_BED 
					|| event.getClickedBlock().getType() == Material.MAGENTA_BED || event.getClickedBlock().getType() == Material.LIME_BED || event.getClickedBlock().getType() == Material.LIGHT_GRAY_BED
					|| event.getClickedBlock().getType() == Material.LIGHT_BLUE_BED || event.getClickedBlock().getType() == Material.GREEN_BED || event.getClickedBlock().getType() == Material.GRAY_BED
					|| event.getClickedBlock().getType() == Material.CYAN_BED || event.getClickedBlock().getType() == Material.BROWN_BED || event.getClickedBlock().getType() == Material.BLUE_BED
					|| event.getClickedBlock().getType() == Material.BLACK_BED) {
				//if (class = "Avian") {
					Player player = event.getPlayer();
					if (player.getLocation().getY() > 86) {
						return;
				} else {
					event.setCancelled(true);
				}
			}
		}
	}
	
}
