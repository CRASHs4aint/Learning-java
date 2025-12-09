package if_else;

import java.util.Scanner;

public class Triangle_verfication {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entered 1st side of triangle:");
        int x = sc.nextInt();
        System.out.print("Entered 2nd side of triangle:");
        int y = sc.nextInt();
        System.out.print("Entered 3rd side of triangle:");
        int z = sc.nextInt();
        if(x+y>z && y+z>x && x+z>y)

        {
            System.out.println("The triangle can be created");
        }
        else{
            System.out.println("The triangle can't be created");
        }
    }
    }


