import java.util.Locale;
import java.util.Scanner;

public class secao06ForExercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de N pares:");
        int qtdDePares = scan.nextInt();
        double num1, num2;

        for(int i = 0; i < qtdDePares; i++) {
            System.out.println("Insira o primeiro valor:");
            num1 = scan.nextDouble();
            System.out.println("Insira o segundo valor:");
            num2 = scan.nextDouble();

            if(num2 == 0) {
                System.out.println("divisao impossivel");
                continue;
            }

            System.out.printf("%.1f%n", num1 / num2);
        }

    }
}
