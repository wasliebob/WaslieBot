package wasliebot.interfaces;

public interface ICommand{
	public void executeCommand(String args, String sender, String channel);
	public boolean requiresOp();
}