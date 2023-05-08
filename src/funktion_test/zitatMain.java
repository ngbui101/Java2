package funktion_test;
import java.io.*;
public class zitatMain {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("zitate.xml"));
		String temp = in.readLine();
		String temp2 = in.readLine();
		System.out.println(temp);
		System.out.println(temp2);
		in.close();
	}

}
