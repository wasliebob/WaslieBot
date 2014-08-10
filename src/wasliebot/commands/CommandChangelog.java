/**
 * Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.commands;

import wasliebot.helpers.FileHelper;
import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandChangelog implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel) {
		for(String message : FileHelper.readFile())
			WaslieBot.bot.sendNotice(sender, message);
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}