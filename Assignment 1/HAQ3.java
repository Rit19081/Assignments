import java.util.Scanner;
public class HAQ3 {
    public static int [] dot_product (int [] a, int [] b ){
        int [] product = new int [a.length];
        for (int i = 0 ; i < a.length ; i++){
            product[i] = a[i] * b[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        System.out.print("Enter the first array: ");
        int [] a = new int [l];
        for (int i = 0 ; i < a.length ; i++){
           a[i] = sc.nextInt();
        }
        System.out.print("Enter the second array: ");
        int [] b = new int [l];
        for (int i = 0 ; i < a.length ; i++){
            b[i] = sc.nextInt();
        }
        int [] product = dot_product(a,b);
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(product[i] + " ");
        }
    }
}
