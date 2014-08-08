package wasliebot.commands;

import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandExit implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel) {
		WaslieBot.bot.disconnect();
		System.exit(0);
	}

	@Override
	public boolean requiresOp() {
		return true;
	}
}