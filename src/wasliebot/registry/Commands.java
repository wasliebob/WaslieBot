/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.registry;

import wasliebot.commands.CommandChangelog;
import wasliebot.commands.CommandDrama;
import wasliebot.commands.CommandExit;
import wasliebot.commands.CommandHelp;
import wasliebot.commands.CommandJoin;
import wasliebot.commands.CommandLatest;
import wasliebot.commands.CommandRoll;
import wasliebot.commands.CommandSource;

public class Commands {
    public static void initCommands(){
    	CommandRegistry.registerCommand("changelog", new CommandChangelog());
    	CommandRegistry.registerCommand("latest", new CommandLatest());
    	CommandRegistry.registerCommand("roll", new CommandRoll());
    	CommandRegistry.registerCommand("join", new CommandJoin());
    	CommandRegistry.registerCommand("drama", new CommandDrama());
    	CommandRegistry.registerCommand("source", new CommandSource());

    	CommandRegistry.registerCommand("help", new CommandHelp());
    	CommandRegistry.registerCommand("exit", new CommandExit());
    }
}