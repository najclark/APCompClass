package quater3;

import java.util.*;
import java.io.*;

public class dataInputTester {

	public static void main(String[] args) throws IOException{

		Scanner s = new Scanner(new File("/home/nicholas/Desktop/work.txt"));
		String text[] = new String[5];
		int count = 0;
		
		while(s.hasNext()){
			text[count] = s.nextLine();
			System.out.println(text[count]);
			count++;
		}
		s.close();
		
	}

}
