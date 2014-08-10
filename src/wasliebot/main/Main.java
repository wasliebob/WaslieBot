/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.main;

import javax.swing.JFrame;

import wasliebot.main.control.Gui;

public class Main extends JFrame{
	private static final long serialVersionUID = 3585619425491571823L;
	
	public static void main(String[] args){
		WaslieBot.init();
		Gui gui = new Gui();
		gui.setSize(575, 70);
		gui.setVisible(true);
	}
}
