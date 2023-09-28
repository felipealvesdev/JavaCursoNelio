import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        int valorA, valorB, valorC, valorD, diferenca;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros para fazer o calculo: (A * B - C * D)");

        valorA = scan.nextInt();
        valorB = scan.nextInt();
        valorC = scan.nextInt();
        valorD = scan.nextInt();

        diferenca = (valorA*valorB - valorC*valorD);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
