package quater2;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Array length: ");
		int[] a = new int[s.nextInt()];
		
		for(int i = 1; i <= a.length; i++){
			a[i-1] = i;
			System.out.print(a[i-1] + " ");
			
			if(i%7 == 0){
				System.out.println();
			}
		}
		

	}

}
