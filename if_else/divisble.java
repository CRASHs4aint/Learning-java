package if_else;

import java.util.Scanner;

public class divisble {
    static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        int a =sc.nextInt();
        if(a%15==0){
            System.out.println("entered number is divisible by both 5 or 3.");
        }
        else if(a%3==0){
            System.out.println("entered number is divisible by 3.");
        }
        else if(a%5==0){
            System.out.println("entered number is divisible by 5 .");
        }
        else{
            System.out.println("entered number is not divisible by 5 or 3.");
        }
    }
}
