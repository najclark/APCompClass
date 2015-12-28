package quater2;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {
		int[] x = new int[700];// physical size

		x[0] = 1;// logical size
		x[1] = 2;// logical size

		for (int j = 0; j < x.length; j++) {
			x[j] = j + 1;
			System.out.println(x[j]);
		}
		
		//Circle cir[] = new Circle[500];
		//for(int j = 0; j < 500; j++)
		//	cir[j] = new Circle(10);
		
	}

}
