package quater3;

import java.util.Arrays;

public class AscendDescend {

	public static void main(String[] args) {
		
		String[] names = {"Herman", "Alfred", "Alvin", "Thomas", "Lee", "Mary", "Bill", "Ezra", "Bernard", "Agnes"};
		
		Arrays.sort(names);
		
		System.out.println("Ascend    Descend");
		for(int i = 0; i < names.length; i++){
			System.out.print(names[i]);
			int length = 10 - names[i].toCharArray().length;
			while(length > 0){
				length--;
				System.out.print(" ");
			}
			System.out.println(names[names.length-i-1]);
		}

	}

}
