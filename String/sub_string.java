package String;

public class sub_string {
    static void main() {
        String s = "samrat";
        System.out.println(s.substring(1, s.length() - 1));
        //output-amra
        System.out.println(("All substring of given string is " + s));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }

    }
}
