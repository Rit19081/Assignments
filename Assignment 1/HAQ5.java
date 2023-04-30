public class HAQ5 {
    public static int max_row(int [][] array){
        int max = 0 , temp = 0;
        for(int i = 0 ; i < array.length ; i++ ){
            int count = 0;
            for(int j = 0 ; j < array[i].length ; j++){
                if (array[i][j] == 1)
                    count++;
            }
            if (count > temp){
                temp = count;
                max = i;
            }
        }
        return max;
    }
    public static int max_col(int [][] array){
        int max = 0 , temp = 0;
        for(int i = 0 ; i < array[0].length ; i++ ){
            int count = 0;
            for(int j = 0 ; j < array.length ; j++){
                if (array[j][i] == 1)
                    count++;
            }
            if (count > temp){
                temp = count;
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][] x = new int[4][4];
        for(int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[i].length ; j++){
                x[i][j] = (int)(Math.random()*2);
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(max_row(x));
        System.out.println(max_col(x));
    }
}
