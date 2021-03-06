/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.registry;

import java.util.HashMap;
import java.util.Set;

import wasliebot.interfaces.ICommand;

public class CommandRegistry {
	public static void registerCommand(String input, ICommand command){
		commands.put(input, command);
	}
	
	public static boolean commandExists(String input){
		return commands.containsKey(input);
	}
	
	public static ICommand getCommand(String input){
		return commands.get(input);
	}
	
	public static Set<String> getKeys(){
		return commands.keySet();
	}
	public static HashMap<String, ICommand> commands = new HashMap<String, ICommand>();
}