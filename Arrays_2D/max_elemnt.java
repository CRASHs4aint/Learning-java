package Arrays_2D;

public class max_elemnt {
    static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}};
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int rowMax = 0;
            for (int j = 0; j < 2; j++) {
                if (rowMax < arr[i][j]) {
                    rowMax = arr[i][j];
                }

            }
            if (rowMax > max) {
               max=rowMax;
            }
        }
        System.out.printf("Maximum element in the given matix is %d", max);

    }
}
