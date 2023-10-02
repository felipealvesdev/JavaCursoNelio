import java.util.Scanner;

public class secao05Exercicio03 {
    public static void main(String[] args) {
        int valorA, valorB;

        Scanner scan = new Scanner(System.in);
        System.out.println("Programa para saber se os números são múltiplos:");

        System.out.println("Por favor, digite o primeiro inteiro:");
        valorA = scan.nextInt();
        System.out.println("Por favor, digite o segundo inteiro:");
        valorB = scan.nextInt();

        if(valorA >= valorB) {
            if(valorA % valorB == 0) {
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }else{
            if(valorB % valorA == 0) {
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao multiplos");
            }
        }
    }
}
