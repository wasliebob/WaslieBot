package wasliebot.main;

import org.jibble.pircbot.PircBot;

import wasliebot.commands.CommandChangelog;
import wasliebot.commands.CommandDrama;
import wasliebot.commands.CommandExit;
import wasliebot.commands.CommandHelp;
import wasliebot.commands.CommandJoin;
import wasliebot.commands.CommandLatest;
import wasliebot.commands.CommandRoll;
import wasliebot.helpers.UserHelper;
import wasliebot.interfaces.ICommand;
import wasliebot.misc.Messages;
import wasliebot.registry.CommandRegistry;

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
		initCommandRegistry();
	}
	public static WaslieBot bot;
	public static CharSequence prefix = "?";
	
    public void joinChannels(){
    	String[] channels = new String[]{
    			"wasliebob",
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
    	sendMessage(sender, Messages.onPM);
    }

    public void initCommandRegistry(){
    	CommandRegistry.registerCommand("changelog", new CommandChangelog());
    	CommandRegistry.registerCommand("latest", new CommandLatest());
    	CommandRegistry.registerCommand("roll", new CommandRoll());
    	CommandRegistry.registerCommand("join", new CommandJoin());
    	CommandRegistry.registerCommand("drama", new CommandDrama());
    	
    	CommandRegistry.registerCommand("help", new CommandHelp());
    	CommandRegistry.registerCommand("exit", new CommandExit());

    }
}