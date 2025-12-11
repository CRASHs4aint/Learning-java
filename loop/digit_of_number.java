package loop;

import java.util.Scanner;

public class digit_of_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multi digit number:");
        int n =sc.nextInt();
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        System.out.printf("Number of digits in entered number is %d",count);
    }

}
