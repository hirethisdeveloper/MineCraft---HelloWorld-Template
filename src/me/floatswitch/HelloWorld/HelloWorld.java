package me.floatswitch.HelloWorld;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
	
	public static HelloWorld plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public final ServerChatPlayerListener playerListener = new ServerChatPlayerListener(this);
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now DISABLED.");
	}
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(this.playerListener, this);
		
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version [" + pdfFile.getVersion() + "] is now ENABLED.");
	}
	
	
	
	
}