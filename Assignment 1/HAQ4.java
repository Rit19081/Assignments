import java.util.Scanner;
public class HAQ4 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] sum = new double [a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array 1 row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the length of the Array 1 column: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the length of the Array 2 row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the length of the Array 2 column: ");
        int c2 = sc.nextInt();
        double [][] x = new double[r1][c1];
        double [][] y = new double[r2][c2];
        System.out.print("Enter the first array: ");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
               x[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Enter the second array: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                y[i][j] = sc.nextDouble();
            }
        }
        double [][] sum = addMatrix(x,y);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}
