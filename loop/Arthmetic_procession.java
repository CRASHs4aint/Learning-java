package loop;

public class Arthmetic_procession {
    static void main(String[] args) {
        for (int i = 2; i <= 3 * i - 1; i = i + 2) {
            System.out.println(i);
        }
    }
}
