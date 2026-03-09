package Arrays_2D;

public class sum_of_matrix {


    static void main() {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sum = sum + arr[i][j];
            }
        }

        System.out.printf("sum of all elements of matrix is %d",sum);
    }


}
