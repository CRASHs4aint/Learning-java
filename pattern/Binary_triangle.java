package pattern;

import java.util.Scanner;

public class Binary_triangle {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row :");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){

            for(int j=1;j<=i;j++) {
                if(i%2!=0 && j%2!=0){
                    System.out.print("1");
                }
                if(i%2!=0 && j%2==0){
                    System.out.print("0");
                }
                if(i%2==0 && j%2==0){
                    System.out.print("1");
                }
                if(i%2==0 && j%2!=0){
                    System.out.print("0");
                }


            }

            System.out.println();
        }

    }
}
