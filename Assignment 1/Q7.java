import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n = sc.nextInt();
		int []array = new int[n];
		System.out.print("Enter elements of the array: ");
		// Array Insertion
		for(int i = 0 ; i < n ; i++) {
			array[i] = sc.nextInt();
		}
		//Finding the largest
		int l1 = array[0];
		for(int i = 0 ; i<n ; i++) {
			int l2 = array[i];
			if (l2>l1) {
				l1=l2;
			}
		}
		//First occurrence 
		int foc = 0;
		for (int i = 0 ; i<n ; i++) {
			if (l1==array[i]) {
				foc=++i;
				break;
			}
		}
		
		//Finding the smallest
		int s1 = array[0];
		for(int i = 0 ; i<n ; i++) {
			int s2 = array[i];
			if (s2<s1) {
				s1=s2;
			}
		}
		//Last occurrence 
		int loc = 0;
		for(int i = n-1 ; i >= 0 ; i--) {
			if (s1==array[i]) {
				loc=++i;
				break;
			}
		}
		//Count of the largest
		int lcount = 0;
		for(int i = 0; i < n ; i++) {
			if (l1 == array[i]) {
				lcount++;
			}
		}
		//Count of the Smallest
		int scount = 0;
		for(int i = 0; i < n ; i++) {
			if (s1 == array[i]) {
				scount++;
			}
		}
		System.out.println("Maximum element of Array is " + l1 + " and occurs " + lcount + " times.");
		System.out.println("Minimum element of Array is " + s1 + " and occurs " + scount + " times.");
		System.out.println("First occurrence of maximum element is at position " + foc);
		System.out.println("Last occurrence of minimum element is at position " + loc);

	}

}
