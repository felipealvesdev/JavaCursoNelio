import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int[] vetorA;
        int[] vetorB;
        int[] vetorC;


        System.out.print("Quantos valores vai ter cada vetor? ");
        qtdNumeros = scan.nextInt();

        vetorA = new int[qtdNumeros];
        vetorB = new int[qtdNumeros];
        vetorC = new int[qtdNumeros];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        for(int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }

    }
}
