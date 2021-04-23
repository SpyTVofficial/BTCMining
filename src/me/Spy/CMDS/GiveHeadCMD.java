package me.Spy.CMDS;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Spy.Main.Utils;

public class GiveHeadCMD implements CommandExecutor {
	
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		    Player p = (Player)sender;
		    if (p.hasPermission("Lobby.build") || p.isOp()) {
		    	if(args.length==0) {
		    		p.setItemInHand(Utils.createItem(Material.SKULL, 1, 0, "test"));
		    	}
		    } else {
		      p.sendMessage("§cKeine Rechte!");
		    } 
		    return false;
		  }

}
