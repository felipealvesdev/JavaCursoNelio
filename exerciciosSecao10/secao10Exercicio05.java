import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        double[] numeros;
        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        qtdNumeros = scan.nextInt();
        numeros = new double[qtdNumeros];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scan.nextDouble();
        }

        maiorValor = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= maiorValor) {
                maiorValor = numeros[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
    }
}
