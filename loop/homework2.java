package loop;

import java.util.Scanner;

public class homework2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        for(int i=0; i<a ;i++){
            System.out.printf("%d\n",i+1);
            System.out.printf("%d\n",a-i);
        }

    }
}
