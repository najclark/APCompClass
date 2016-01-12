package quater3;

public class Tester {

	public static void main(String[] args) {
		int[][] a = { { 2, 4 }, { 3, 6 } };
		int[][] b = { { 3 }, { 6 } };

		if (a[0].length == b.length) {
			int[][] c = MatrixMult.mult(a, b);
			for (int row = 0; row < c.length; row++) {
				for (int col = 0; col < c[0].length; col++) {
					System.out.println(c[row][col]);
				}
			}
		}
		else{
			System.out.println("Matrices are unable to be multiplied.");
		}
	}

}
