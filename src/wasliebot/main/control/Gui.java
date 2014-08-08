package wasliebot.main.control;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import wasliebot.main.WaslieBot;

public class Gui extends JFrame{
	public Gui(){		
		createGUI();
	}
	private static final long serialVersionUID = 1L;
	public JTextField bar;
	
	public void createGUI() {
		Container window = this.getContentPane();
		bar = new JTextField(50);
		bar.addActionListener(new Action(bar));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		window.setLayout(new FlowLayout());
		        
		window.add(bar);
		window.setBackground(new Color(255, 255, 255));
	}
	
	public class Action implements ActionListener{
		public Action(JTextField field){
			this.field = field;
		}
		JTextField field;
		
		@Override
		public void actionPerformed(ActionEvent e){
			if(field.getText().contains("exit")){
				WaslieBot.bot.disconnect();
				System.exit(0);
			}
		}
	}
}