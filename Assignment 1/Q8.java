import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][]array = new int [r][c];
		System.out.print("Enter elements of 2D-Array: ");
		for(int i = 0 ; i < r ; i++) {
			for(int j = 0 ; j < c ; j++) {
				array[i][j] = sc.nextInt();
				} 
		}
		System.out.println("The elements of 2D array are: ");
		int sum = 0;
		for(int i = 0 ; i < r ; i++) {
			for(int j = 0 ; j < c ; j++) {
				sum = sum + array[i][j];
				System.out.print(array[i][j] + " ");
				} 
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is " + sum);
		

	}

}
