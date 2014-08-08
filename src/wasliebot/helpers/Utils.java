package wasliebot.helpers;

import java.util.Random;

public class Utils {
	public static int random(int start, int end){
		Random random = new Random();
		int rand = random.nextInt(end - start + 1) + start;
		return rand;
	}
}