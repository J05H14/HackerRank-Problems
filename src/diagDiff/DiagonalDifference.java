package diagDiff;

public class DiagonalDifference {
	public static void main(String args[]) {
		int[][] arr = {
				{11,2,4},
				{4,5,6},
				{10,8,-12}};
		System.out.println(diagonalDifference(arr));
	}
	/*
	 * sample
	 * 11 2 4
	 * 4 5 6
	 * 10 8 -12
	 */
	public static int diagonalDifference(int[][] arr) {
		int maj = 0;
		int min = 0;
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[r].length; c++) {
				if(r == c) {
					maj += arr[r][c];
				}
				if(r + c == 2) {
					min += arr[r][c];
				}
			}
		}
		return Math.abs(maj - min);
		
    }
}
