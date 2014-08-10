/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.enums;

import java.awt.Toolkit;

public enum EnumScreen {
	WIDTH(Toolkit.getDefaultToolkit().getScreenSize().width), HEIGHT(Toolkit.getDefaultToolkit().getScreenSize().height);
	
	public int size;
	private EnumScreen(int size){
		this.size = size;
	}
}