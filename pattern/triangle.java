package pattern;

import java.util.Scanner;

public class triangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern:");
        int x= sc.nextInt();
        for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
