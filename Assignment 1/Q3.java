import java.util.Scanner;
public class Q3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int sum=0,mul=1,num=n,rem=0;
		while(num>0) {
			rem = num%10;
			sum = sum + rem;
			mul = mul * rem;
			num = num/10;
		}
		if (sum == mul) 
			System.out.println(n +" is a spy number.");
		else
			System.out.println(n +" is a spy number.");
		
	}

}
