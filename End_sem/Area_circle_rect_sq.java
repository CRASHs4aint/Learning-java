//package End_sem;
//
//import java.util.Scanner;
//
//public class Area_circle_rect_sq {
//    static void area(int a) {
//        System.out.println(3.14 * a * a);
//    }
//
//    static void area(int a) {
//        System.out.println(a * a);
//    }
//
//    static void area(int a, int b) {
//        System.out.println(a * b);
//    }
//
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the length:");
//        int a = sc.nextInt();
//        System.out.print("enter the length:");
//        int b = sc.nextInt();
//        area(a);
//
//
//        area(a);
//
//        area(a, b);
//
//    }
//
//}
package End_sem;

import java.util.Scanner;

public class Area_circle_rect_sq {

    // Circle (use double)
    static void area(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    // Square
    static void area(int a) {
        System.out.println("Area of square: " + (a * a));
    }

    // Rectangle
    static void area(int a, int b) {
        System.out.println("Area of rectangle: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side (square): ");
        int a = sc.nextInt();

        System.out.print("Enter radius (circle): ");
        double r = sc.nextDouble();

        System.out.print("Enter length & breadth (rectangle): ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        area(a);        // square
        area(r);        // circle
        area(l, b);     // rectangle
    }
}