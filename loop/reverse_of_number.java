package loop;

import java.util.Scanner;

public class reverse_of_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multi digit number:");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            rev = rev * 10;
            rev = rev + (n % 10);

            n = n / 10;
        }
        System.out.printf("Reverse od entered number is %d", rev);
    }
}
