package if_else;

import java.util.Scanner;

public class profit_loss {
    static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Enter seller buy rate:");
        double buy = sc.nextDouble();
//        System.out.println("\n");
        System.out.print("Enter seller sell rate:");
        double sell = sc.nextDouble();

//        double losspercent = (buy - sell) * 100 / buy;
//        double profitpercent = 100 - ((buy - sell) * 100 / buy);

        if (buy > sell) {
            System.out.println("Shopkeeper made loss of" + (buy - sell));
        }
        if (buy < sell) {
            System.out.println("Shopkeeper made profit of" + (sell - buy));
        } else {
            System.out.println("Not loss not profit");
        }
    }
}
