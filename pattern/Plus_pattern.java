package pattern;

import java.util.Scanner;

public class Plus_pattern {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern:");
        int x = sc.nextInt();
        int mid=0;
        if(x%2==0){
            mid=x/2;
        }
        else{
            mid=x/2 +1;
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++) {
              if(i==mid || j==mid){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }


            }
            System.out.println();
            }
    }
}
