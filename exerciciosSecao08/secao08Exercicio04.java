import java.util.Locale;
import java.util.Scanner;

public class secao08Exercicio04 {
    public static void main(String[] args) {

        double dollarPrice;
        double dollarsBought;
        final double IOF = 0.06;
        double totalAmountInReais;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, insert the information below:");
        System.out.println("What is the dollar price?");
        dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought?");
        dollarsBought = scan.nextDouble();

        totalAmountInReais = CurrencyConverter.dollarsIntoReais(dollarPrice, dollarsBought);

        System.out.printf("Amount to be paid in reais = %.2f", totalAmountInReais+(totalAmountInReais*IOF));
    }
}
