/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.main;

import org.jibble.pircbot.PircBot;

import wasliebot.helpers.UserHelper;
import wasliebot.helpers.Utils;
import wasliebot.interfaces.ICommand;
import wasliebot.misc.Messages;
import wasliebot.registry.CommandRegistry;
import wasliebot.registry.Commands;

public class WaslieBot extends PircBot{
	public static void init(){
		bot = new WaslieBot();
    	bot.setVerbose(true);
    	bot.setName("WaslieBot");
    	bot.setMessageDelay(25);

    	try{
        	bot.connect("irc.esper.net");
        }catch(Exception e){
        	e.printStackTrace();
        }
    	bot.joinChannels();
	}
	
	public WaslieBot(){
		Commands.initCommands();
    	Messages.initPrivateMessages();
	}
	public static WaslieBot bot;
	public static CharSequence prefix = "?";
	
    public void joinChannels(){
    	String[] channels = new String[]{
    			"wasliebob",
    			"WaslieBot",
    			"WaslieTest"};
    	
    	for(String s : channels)
    		bot.joinChannel("#" + s);
    }
	    
    @Override
    public void onMessage(String channel, String sender, String login, String hostname, String m){
    	if(m.toLowerCase().startsWith((String) prefix)){
    		int max = m.length();
    		for(int i = 0; i < m.length(); i++){
        		char c = m.toCharArray()[i];
        		if(c == ' ')
        			max = i;
        	}
        	
        	String message = m.substring(1, max);

	    	if(CommandRegistry.commandExists(message.toLowerCase())){
	    		ICommand command = CommandRegistry.getCommand(message);
	    		if(!command.requiresOp()){
	    			command.executeCommand(m.substring(max), sender, channel);
	    		}else if(command.requiresOp()){
	    			if(UserHelper.isOp(sender, channel))
	    				command.executeCommand(m.substring(max), sender, channel);
	    			else
	    				sendNotice(sender, Messages.needOP);
	    		}
	    	}else{
	    		sendNotice(sender, Messages.invalidCommand);
	    	}
    	}
    }
    
    @Override
    public void onPrivateMessage(String sender, String login, String hostname, String message){
    	sendMessage(sender, Messages.onPM.get(Utils.random(0, Messages.onPM.size() - 1)));
    }
}