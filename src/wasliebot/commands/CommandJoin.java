package wasliebot.commands;

import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandJoin implements ICommand{
	@Override
	public void executeCommand(String args, String sender, String channel) {
		if(args.length() > 1){
			String arg = args.substring(1);
			try{
				WaslieBot.bot.joinChannel("#" + arg);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean requiresOp() {
		return true;
	}
}