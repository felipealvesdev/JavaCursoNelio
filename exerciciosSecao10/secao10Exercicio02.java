import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        double[] numerosDigitados;
        double soma = 0;

        System.out.printf("Quantos numeros voce vai digitar? ");
        qtdNumeros = scan.nextInt();

        numerosDigitados = new double[qtdNumeros];

        for(int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("%nDigite um numero: ");
            numerosDigitados[i] = scan.nextDouble();
            soma += numerosDigitados[i];
        }

        System.out.printf("%nVALORES = ");
        for(int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf(" %.2f ", numerosDigitados[i]);
        }

        System.out.printf("%nSOMA = %.2f" , soma);
        System.out.printf("%nMEDIA = %.2f%n" , (soma/qtdNumeros));
    }
}
