package com.ruseps.model.input.impl;

import com.ruseps.model.input.Input;
import com.ruseps.world.content.clan.ClanChatManager;
import com.ruseps.world.entity.impl.player.Player;

public class EnterClanChatToJoin extends Input {

	@Override
	public void handleSyntax(Player player, String syntax) {
		if(syntax.length() <= 1) {
			player.getPacketSender().sendMessage("Invalid syntax entered.");
			return;
		}
		ClanChatManager.join(player, syntax);
	}
}
