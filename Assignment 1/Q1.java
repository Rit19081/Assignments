
public class Q1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int count=0;
		System.out.println("The positive integer greater than 2 from command line argument is : " + a);
		int n = a;
		while(n>=2) {
			n = n/2;
			count++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is: " + count);
		
		

	}

}
