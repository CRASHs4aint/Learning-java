package pattern;

import java.util.Scanner;

public class floyd_triangle {
    static void main() {
        int a=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row :");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++) {
                System.out.printf("%d ",a);
                a++;
            }

            System.out.println();
            }

            }
}
