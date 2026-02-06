package pattern;

import java.util.Scanner;

public class Cross_pattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern:");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++) {
                if(i==j || i+j==x+1){
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
