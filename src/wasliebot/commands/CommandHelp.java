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