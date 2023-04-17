import java.util.Scanner;
public class Q9 {
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0 ; i < m.length ; i++) {
			for(int j = 0 ; j < m[i].length ; j++) {
				if (i == j) {
					sum = sum + m[i][j];
				} 
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		if (r == 4 && c == 4) {
			double [][]array = new double [r][c];
			System.out.print("Enter elements of 2D-Array: ");
			for(int i = 0 ; i < r ; i++) {
				for(int j = 0 ; j < c ; j++) {
					array[i][j] = sc.nextDouble();
				} 
			}
			for(int i = 0 ; i < r ; i++) {
				for(int j = 0 ; j < c ; j++) {
					System.out.print(array[i][j] + " ");
					} 
				System.out.println();
			}
			System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));
		}
		else 
			System.out.println("Wrong input");
	}

}
