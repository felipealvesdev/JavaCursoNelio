import java.util.Scanner;

public class secao05Exercicio01 {
    public static void main(String[] args) {
        int num1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira um número:");
        num1 = scan.nextInt();

        if(num1<0) {
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
