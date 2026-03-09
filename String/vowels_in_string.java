package String;

public class vowels_in_string {
    static void main() {
        String s="samrat";
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                count++;
            }
        }
        System.out.println("Number of vowels present in given string is" +count);
    }
}
