package if_else;

import java.util.Scanner;

public class No_of_digit {
    static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();

        if(a>999 && a<10000){
            System.out.println("Entered number is 4 number  digit.");
        }else{
            System.out.println("Entered number is not a 4 number  digit.");
        }
    }
}
