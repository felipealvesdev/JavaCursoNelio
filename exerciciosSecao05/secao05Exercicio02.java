import java.util.Scanner;

public class secao05Exercicio02 {
    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para saber se é ímpar ou par:");
        num1 = scan.nextInt();

        if(num1 % 2 == 0) {
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }// lembrando que zero nao é impar e nem par, apenas seguindo o exercicio proposto.
    }
}
