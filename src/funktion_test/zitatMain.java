package funktion_test;

import java.io.*;
import java.util.Scanner;

public class zitatMain {
	
	public String inhaltExtrahieren(String zeile, String tag) {
		Scanner sc = new Scanner(zeile);
		String inhalt = "";
		while (sc.hasNext()) {
			String wort = (String) sc.next();
			if(wort.equals(tag)) {
			
			}
			
		}
		sc.close();
		return null;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("zitate.xml"));
		//PrintWriter out = new PrintWriter(new FileWriter("Zitate.txt"));
		String temp = in.readLine();
		Scanner sc = new Scanner(temp);
		System.out.println(sc.next());
		in.close();
		sc.close();
	}

}
