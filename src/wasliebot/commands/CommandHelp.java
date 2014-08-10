/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.commands;

import org.jibble.pircbot.Colors;

import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;
import wasliebot.registry.CommandRegistry;

public class CommandHelp implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel) {
		for(String message : CommandRegistry.getKeys())
			WaslieBot.bot.sendNotice(sender, Colors.CYAN + message);
	}
	
	@Override
	public boolean requiresOp() {
		return false;
	}
}