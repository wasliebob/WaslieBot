/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.misc;

import java.util.ArrayList;

public class Messages{
	public static String workInProgress = "This command it still work in progress";
	public static String needOP = "You need to be an op to do that";
	public static String invalidCommand = "This command does not exist";
	public static ArrayList<String> onPM = new ArrayList<String>();
	
	public static void initPrivateMessages(){
		onPM.add("Why are you even trying to pm me, you know i'm a bot");
		onPM.add("You're crazy, i'm a robot, not an human");
		onPM.add("I don't hear anything");
		onPM.add("I can do stuff and no one will ever notice :3");
		onPM.add("No one is watching you");
		onPM.add("I might be a bot, but i got feelings to");
		onPM.add("You're talking to a bot, don't you have friends to talk to");
		onPM.add("Since when can bots answer to an private message");
	}
}