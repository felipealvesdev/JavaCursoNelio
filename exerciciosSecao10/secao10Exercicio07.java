import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdElementos;
        double[] numeros;

        System.out.print("Quantos elementos vai ter o vetor? ");
        qtdElementos = scan.nextInt();
        numeros = new double[qtdElementos];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scan.nextDouble();
        }

        double mediaVetor = 0;
        for(int i = 0; i < numeros.length; i++) {
            mediaVetor += numeros[i] / numeros.length;
        }
        System.out.printf("%nMEDIA DO VETOR = %.3f%n", mediaVetor);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i]< mediaVetor) {
                System.out.println(numeros[i]);
            }
        }
    }
}
