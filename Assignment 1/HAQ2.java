import java.util.Scanner;
public class HAQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to input? ");
        int l = sc.nextInt();
        sc.nextLine();
        String a [] = new String[l];
        System.out.print("Enter the lines: ");
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextLine();
        }
        for(int j = a.length-1 ; j >= 0  ; j--){
            System.out.println(a[j]);
        }

    }
}
