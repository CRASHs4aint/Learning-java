package if_else;

import java.util.Scanner;

public class magnitude {
    static  void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        if(a<0){
            if(-a!=69){
                System.out.println("Entered number magnitude is not 69.");
            }else{
                System.out.println("Entered number magnitude is 69.");
            }
        }else{
            if(a!=69){
                System.out.println("Entered number magnitude is not 69.");
            }else{
                System.out.println("Entered number magnitude is 69.");
            }
        }

    }
}
