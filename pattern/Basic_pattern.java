package pattern;

public class Basic_pattern {
    static void main() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.print("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 65; j <= 68; j++) {
                char ch = (char) j;
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.print("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 97; j <= 100; j++) {
                char ch = (char) j;
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.print("\n");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.print("\n");

        for (int i = 65; i <= 68; i++) {
            for (int j = 1; j <= 4; j++) {
                char ch = (char) i;
                System.out.print(ch);
            }
            System.out.println();

        }
        System.out.print("\n");

        for (int i = 65; i <= 68; i++) {
            for (int j = 1; j <= 4; j++) {
                char ch = (char) i;
                char toPrint = (ch == 'A') ? Character.toLowerCase(ch) : ch;
                System.out.print(toPrint);
            }
            System.out.println();
        }
    }
}
