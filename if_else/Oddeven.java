package if_else;

import java.util.Scanner;

public class Oddeven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a postive number:");
        int a = sc.nextInt();
        if (a % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd Number");
    }
}
