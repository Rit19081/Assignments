import java.util.Scanner;
public class Q6 {
	public static boolean isOdd(int n) {
		return (n&1)==1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isOdd(3));

	}

}
