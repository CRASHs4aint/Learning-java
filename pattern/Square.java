package pattern;

import java.util.Scanner;

public class Square {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of row in star pattern:");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
