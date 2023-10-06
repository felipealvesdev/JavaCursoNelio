import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int[] numerosDigitados;

        System.out.printf("Quantos numeros voce vai digitar?");
        qtdNumeros = scan.nextInt();

        numerosDigitados = new int[qtdNumeros];

        for(int i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("Digite um numero:");
            numerosDigitados[i] = scan.nextInt();
            System.out.println();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < numerosDigitados.length; i++) {
            if(numerosDigitados[i] <0) {
                System.out.println(numerosDigitados[i]);
            }
        }
    }
}
