package wasliebot.commands;

import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandLatest implements ICommand{

	@Override
	public void executeCommand(String args, String sender, String channel) {
		WaslieBot.bot.sendNotice(sender, "http://ci.tterrag.com/job/Modular%20Machines/lastSuccessfulBuild/");
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}