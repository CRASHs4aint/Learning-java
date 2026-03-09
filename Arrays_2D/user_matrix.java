package Arrays_2D;

import java.util.Scanner;

public class user_matrix {
    static void main() {
        int[][] arr=new int[5][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered matix is:");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
