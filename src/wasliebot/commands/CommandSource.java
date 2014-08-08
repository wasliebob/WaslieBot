package wasliebot.commands;

import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandSource implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel) {
		WaslieBot.bot.sendNotice(sender, "https://github.com/wasliebob/WaslieBot");
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}