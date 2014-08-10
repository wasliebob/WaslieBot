/**
* Created by wasliebob, on 10 aug. 2014, at 19:07:43
*/
package wasliebot.helpers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
	public static ArrayList<String> readFile(){
		ArrayList<String> list = new ArrayList<String>();
		URL url;
		try{
			url = new URL("http://ci.tterrag.com/job/Modular%20Machines/lastSuccessfulBuild/artifact/src/main/resources/changelog.txt");
			Scanner scanner = new Scanner(url.openStream());
					
			while(scanner.hasNext()){
				String next = scanner.nextLine();
				list.add(next);
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}