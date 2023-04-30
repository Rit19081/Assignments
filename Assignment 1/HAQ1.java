import java.util.Scanner;
public class HAQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a':");
        int a = sc.nextInt();
        System.out.print("Enter the value of 'b':");
        int b = sc.nextInt();
        System.out.print("Enter the value of 'c':");
        int c = sc.nextInt();
        if (a+b == c)
            System.out.println("The "+ a + "," + b + ","+ c +" can be written in " + a + "+" + b + "="+ c);
        else if (a==b-c)
            System.out.println("The "+ a + "," + b + ","+ c +" can be written in " + a + "=" + b + "-"+ c);
        else if (a*b == c)
            System.out.println("The "+ a + "," + b + ","+ c +" can be written in " + a + "*" + b + "="+ c);
        else
            System.out.println("It can't be written in any form");


    }
}
