import java.util.Locale;
import java.util.Scanner;

public class exericicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;

        double valorUnitarioPeca1, valorUnitarioPeca2, parcialPeca1, parcialPeca2, total;

        Scanner scan = new Scanner(System.in);

        codigoPeca1 = scan.nextInt();
        numeroPecas1 = scan.nextInt();
        valorUnitarioPeca1 = scan.nextDouble();
        parcialPeca1 = numeroPecas1 * valorUnitarioPeca1;

        codigoPeca2 = scan.nextInt();
        numeroPecas2 = scan.nextInt();
        valorUnitarioPeca2 = scan.nextDouble();
        parcialPeca2 = numeroPecas2 * valorUnitarioPeca2;

        total = parcialPeca1 + parcialPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
