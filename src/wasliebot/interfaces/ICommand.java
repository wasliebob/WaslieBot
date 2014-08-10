/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.interfaces;

public interface ICommand{
	public void executeCommand(String args, String sender, String channel);
	public boolean requiresOp();
}