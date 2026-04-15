package End_sem;

import java.util.Scanner;

public class fibnacci {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter no of terms of Fibonacci terms:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+ " ");

        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");


        }
    }
}
