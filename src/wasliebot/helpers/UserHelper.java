package wasliebot.helpers;

import org.jibble.pircbot.User;

import wasliebot.main.WaslieBot;

public class UserHelper {
	public static boolean isOp(String sender, String channel){
		User[] users = WaslieBot.bot.getUsers(channel);
		WaslieBot.bot.sendMessage(sender, channel);
		for(User user : users){
			if(user.equals(sender) && user.isOp())
				return user.isOp();		
		}
		return false;
	}
}