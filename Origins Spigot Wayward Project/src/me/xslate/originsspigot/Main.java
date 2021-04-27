package me.xslate.originsspigot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bukkit.plugin.java.JavaPlugin;
import me.xslate.originsspigot.avian.EffectEvents;
import me.xslate.originsspigot.avian.MeatEatingEvents;
import me.xslate.originsspigot.avian.SleepEvents;
import me.xslate.originsspigot.gui.Gui;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new SleepEvents(), this);
		getServer().getPluginManager().registerEvents(new EffectEvents(), this);
		getServer().getPluginManager().registerEvents(new MeatEatingEvents(), this);
		
		getCommand("class").setExecutor(new Gui());
	
	}
public static final Pattern HEX = Pattern.compile("<#(\\w{5}[0-9a-f])>");

	
	public static String c(String message) {
		  Matcher matcher = HEX.matcher(message);
		  StringBuffer buffer = new StringBuffer();

		  while(matcher.find()) {
		    matcher.appendReplacement(buffer, ChatColor.of("#" + matcher.group(1)).toString());
		  }
		        
		  return ChatColor.translateAlternateColorCodes('&', matcher.appendTail(buffer).toString());
		}
}