import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdElementos;
        int[] numeros;
        double somaPares = 0;
        int qtdPares = 0;

        System.out.print("Quantos elementos vai ter o novo vetor? ");
        qtdElementos = scan.nextInt();
        numeros = new int[qtdElementos];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            int numeroDigitado = scan.nextInt();
            if(numeroDigitado%2 == 0) {
                numeros[i] = numeroDigitado;
                somaPares += numeroDigitado;
                qtdPares++;
            }
        }

        if(qtdPares != 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", (somaPares/qtdPares));
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
