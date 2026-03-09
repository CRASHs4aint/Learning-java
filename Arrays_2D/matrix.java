package Arrays_2D;

public class matrix {
    static void main() {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print( arr[i][j]  );
            }
            System.out.println();
        }
    }
}
