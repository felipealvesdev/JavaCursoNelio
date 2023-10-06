import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int qtdPares = 0;


        System.out.printf("Quantos numeros voce vai digitar? ");
        qtdNumeros = scan.nextInt();

        int[] numeros = new int[qtdNumeros];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0) {
                System.out.printf("%d ", numeros[i]);
                qtdPares++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);
    }
}
