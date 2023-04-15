import java.util.Scanner;
public class Q5 {
	public static int sum_Of_Digits(int n) {
		Scanner sc = new Scanner (System.in);
		int num = n,sum=0,rem=0,rem1=0,sum1=0;
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if(sum >10) {
			
			while(sum>0) {
				rem1 = sum % 10;
				sum1 = sum1 + rem1;
				sum = sum / 10;
			}
			return sum1;
		}
		else
			return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Sum of digits of " + n + " until the number is a single digit is " + sum_Of_Digits(n));

	}

}
