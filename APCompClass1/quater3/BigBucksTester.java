package quater3;

import java.util.ArrayList;
import java.util.Scanner;

public class BigBucksTester {

	public static void main(String[] args) {
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		Scanner n = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		
		String nm = "";
		while (!nm.equalsIgnoreCase("exit")){
			System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
			nm = n.nextLine();
			if(nm.equalsIgnoreCase("exit")) {
				System.out.println();
				break;
			}
			System.out.print("Please enter the amount of the deposit. ");
			double amt = d.nextDouble();
			list.add(new BankAccount(nm, amt));
			System.out.println();
		}
		
		double largest = Double.MIN_VALUE;
		String name = "";
		for (int i = 0; i < list.size(); i++){
			if (list.get(i).balance > largest){ 
				largest = list.get(i).balance;
				name = list.get(i).name;
			}
		}
		System.out.println("The account with the largest balance belongs to " + name + ".");
		System.out.println("The amount is $" + largest + ".");
	}
}
