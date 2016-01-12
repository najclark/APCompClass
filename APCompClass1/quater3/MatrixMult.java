package quater3;

public class MatrixMult {
	public static int[][] mult(int a[][], int b[][]) {
		int aRows = a.length;
		int aColumns = a[0].length;
		int bColumns = b[0].length;

		int[][] product = new int[aRows][bColumns];

		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return product;
	}
}
