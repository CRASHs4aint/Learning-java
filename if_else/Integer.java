package if_else;

import java.util.Scanner;

public class Integer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number:");
        double a = sc.nextDouble();
        int b = (int) a;

        if (a == b) {
            System.out.println("Entered number is integer");
        } else {
            System.out.println("Entered number is not a integer");
        }
    }
}
