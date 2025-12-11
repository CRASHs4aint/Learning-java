package loop;

import java.util.Scanner;

public class prime_check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= x - 1; i++) { //for(int i=2;i<=Math.sqrt(n);i++  ---this is also a method
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (x == 1) System.out.printf("%d is not prime nor composite.", x);
        else if (flag == false) System.out.printf("%d is a composite number.", x);
        else System.out.printf("%d is a prime number.", x);
    }
}
