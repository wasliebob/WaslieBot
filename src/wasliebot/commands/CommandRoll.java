/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.commands;

import java.util.ArrayList;

import wasliebot.helpers.Utils;
import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandRoll implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel){
		if(args.length() > 1){
			String arg = args.substring(1);
			ArrayList<String> possible = new ArrayList<String>();
			for(int i = 0; i <= 1000; i++)
			possible.add("" + i);
		
		if(arg != null && possible.contains(arg))
			WaslieBot.bot.sendMessage(channel, sender + " rolled " + Utils.random(1, Integer.parseInt(arg)));
		else
			WaslieBot.bot.sendMessage(channel, sender + " rolled " + Utils.random(1, 100));
		}else{
			WaslieBot.bot.sendMessage(channel, sender + " rolled " + Utils.random(1, 100));
		}
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}