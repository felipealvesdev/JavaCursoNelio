import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira o número de linhas e de colunas da matriz " +
                "NxM: ");
        int linhas = scan.nextInt();
        int colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Por favor, preencha todos os valores da matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                int numeroFornecido = scan.nextInt();
                matriz[i][j] = numeroFornecido;
            }
        }
        System.out.println("Números salvos.");
        System.out.println("Insira o numero que deseja saber a posicao dele na matriz, " +
                "e os numeros ao seu redor: ");
        int numeroProcurado = scan.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroProcurado) {
                    System.out.println("Position " + i + "," + j);
                    if(j-1 >= 0 ) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if(j+1 < colunas) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i+1 < linhas) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                    if(i-1 >= 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                }
            }
            System.out.println();
        }
        System.out.println("numero procurado: " + numeroProcurado);
    }
}
