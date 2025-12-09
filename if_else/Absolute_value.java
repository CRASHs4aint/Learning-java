package if_else;

import java.util.Scanner;

public class Absolute_value {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer:");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println(-a);
        } else {
            System.out.println(a);
        }
    }
}
