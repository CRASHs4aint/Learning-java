package String;

import java.util.Scanner;

public class palindrome_string {
    static void main() {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter a string:");
//       String s=sc.nextString();
        boolean flag=false;
        String s="racecar";
       int i=0;
       int j=s.length()-1;
       while(i<j){
           if(s.charAt(i)==s.charAt(j)){
               i++;
               j--;
               flag=true;
           }
           else{
               flag=false;
               break;

           }

       }
       if(flag==true){
           System.out.println("given string is palindrome ");
       }
       else{
           System.out.println("given string is palindrome ");
       }
    }
}
