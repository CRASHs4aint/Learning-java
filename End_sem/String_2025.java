package End_sem;

import java.util.Scanner;

public class String_2025 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String s1 = sc.nextLine();
        System.out.print("Enter your father's name:");
        String s2 = sc.nextLine();
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1.compareTo(s2));
        System.out.println(s3.length());

    }

    //This only takes one word (no spaces).--sc.next();

}
