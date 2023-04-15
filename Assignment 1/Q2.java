import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person Weight in kg: ");
		double weight = sc.nextDouble();
		System.out.print("Enter height of person in meter: ");
		double height = sc.nextDouble();
		double BMI = weight/(height*height);
		if (BMI<18.5) 
			System.out.println("The person is Underweight.");
		else if (BMI<24.9) 
			System.out.println("The person is Normal Weight.");
		else if (BMI<29.9) 
			System.out.println("The person is Overweight.");
		else if (BMI>30.0) 
			System.out.println("The person is Obese.");
	}

}
