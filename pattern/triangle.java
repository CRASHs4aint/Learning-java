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
            System.out.println();
        }
        System.out.println("\n");


        for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");


        for (int i=1;i<=x;i++){
            for(int j=65;j<(65+i);j++){
                char ch = (char) j;
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
