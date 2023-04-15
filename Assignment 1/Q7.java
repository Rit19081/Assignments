import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n = sc.nextInt();
		int []array = new int[n];
		System.out.print("Enter elements of the array: ");
		for(int i = 0 ; i < n ; i++) {
			array[i] = sc.nextInt();
		}
		int l1 = array[0];
		for(int i = 0 ; i<n ; i++) {
			int l2 = array[i];
			if (l2>l1) {
				l1=l2;
			}
		}
		int s1 = array[0];
		for(int i = 0 ; i<n ; i++) {
			int s2 = array[i];
			if (s2<s1) {
				s1=s2;
			}
		}
		System.out.println(l1 + " " + s1);
		int lcount = 0;
		for(int i = 0; i < n ; i++) {
			if (l1 == array[i]) {
				lcount++;
			}
		}
		
		int scount = 0;
		for(int i = 0; i < n ; i++) {
			if (s1 == array[i]) {
				scount++;
			}
		}
		System.out.println(lcount + " " + scount);
		

	}

}
