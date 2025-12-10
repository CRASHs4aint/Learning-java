package loop;

public class Table_of_17 {
    static void main(String[] args) {
        int a = 17;
        System.out.println("Table of 17 is:");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.printf("%d X %d = %d \n",a,i,a*i);
        }
    }
}
