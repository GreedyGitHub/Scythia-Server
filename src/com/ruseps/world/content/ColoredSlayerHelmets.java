package com.ruseps.world.content;

import com.ruseps.world.entity.impl.player.Player;

public class ColoredSlayerHelmets {
	
	
	
	public static void changeColor(final Player player, int item1, int item2) {
		String color;
		if(item2 == 7986) {
			color = "red";
			player.getInventory().delete(7986, 1);
			player.getInventory().delete(13263,1);
			player.getInventory().add(8465,1);
			player.getPA().sendMessage("@blu@You successfully craft a@bla@ "+color+" @blu@slayer helmet");
			
		}
		if(item2 == 7981) {
			color = "green";
			player.getInventory().delete(7981, 1);
			player.getInventory().delete(13263,1);
			player.getInventory().add(8467,1);
			player.getPA().sendMessage("@blu@You successfully craft a@bla@ "+color+" @blu@slayer helmet");

		}
		if(item2 == 7980) {
			color = "black";
			player.getInventory().delete(7980, 1);
			player.getInventory().delete(13263,1);
			player.getInventory().add(8469,1);
			player.getPA().sendMessage("@blu@You successfully craft a@bla@ "+color+" @blu@slayer helmet");

		}
	}

}
