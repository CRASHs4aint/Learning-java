package pattern;

import java.util.Scanner;

public class opposite_right_angle_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern :");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - i; j++) {
                char ch =(char) (j+97);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
