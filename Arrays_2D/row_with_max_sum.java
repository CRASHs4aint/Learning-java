package Arrays_2D;

public class row_with_max_sum {
    static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}};
        int max = 0;
        int row=-1;
        for (int i = 0; i < 3; i++) {
            int row_sum = 0;
            for (int j = 0; j < 2; j++) {
               row_sum=row_sum +arr[i][j];

            }
           if(max<row_sum){
             max=row_sum;
             row=i;
           }
        }
        System.out.printf("the greatest row is %d",row);
    }
}
