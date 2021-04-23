package me.Spy.Main;

import org.bukkit.plugin.java.JavaPlugin;

import me.Spy.CMDS.GiveHeadCMD;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		init();
	}
	
	private void init() {
		getCommand("givehead").setExecutor(new GiveHeadCMD());
	}

}
