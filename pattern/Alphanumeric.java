package pattern;

import java.util.Scanner;

public class Alphanumeric {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern:");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) (j+64);

                if (i % 2 != 0) {
                    System.out.print(j);
                } else {


                    System.out.print(ch);

                }

            }
            System.out.println();
        }
    }
}
