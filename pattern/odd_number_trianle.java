package pattern;

import java.util.Scanner;

public class odd_number_trianle {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row :");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int a=1;
            for(int j=1;j<=i;j++) {
                System.out.printf("%d ",a);
                a+=2;
            }

            System.out.println();
        }

    }
}
