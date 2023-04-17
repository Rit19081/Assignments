import java.util.Scanner;
public class Q10 {
	public static double sumColumn(double[][] m, int colIn) {
		double sum = 0;
		for(int i = 0 ; i < m.length ; i++) {
			for(int j = 0 ; j < m[i].length ; j++) {
				if (j == colIn) {
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
		if (r == 3 && c == 4) {
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
			System.out.println("Enter the column number: ");
			int col = sc.nextInt();
			System.out.println("Sum of the elements at column " +  col  + " is " + sumColumn(array, col));
		}
		else 
			System.out.println("Wrong input");

		

	}

}
