package loop;

import java.util.Scanner;

public class Sum_of_digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multi digit number:");
        int n =sc.nextInt();
        int sum=0;
        while (n!=0){
            sum=sum+(n%10);
            n=n/10;

        }
        System.out.printf("Sum of digits in entered number is %d",sum);
    }
}
