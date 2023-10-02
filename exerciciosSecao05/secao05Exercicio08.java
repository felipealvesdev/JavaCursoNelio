import java.util.Locale;
import java.util.Scanner;

public class secao05Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double salario, imposto;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira o salário para saber o imposto sobre ele:");
        salario = scan.nextDouble();

        if (salario <= 2000) {
            imposto = 0;
        }else if (salario > 2000 && salario <= 3000) {
            imposto = salario * 0.08;
        }else if(salario > 3000 && salario <= 4500) {
            imposto = 1000 * 0.08;
            imposto += (salario-1000-2000) * 0.18;
        }else if (salario > 4500) {
            imposto = 1000 * 0.08;
            imposto += 1500 * 0.18;
            imposto += (salario-2500-2000) * 0.28;
        }else {
            imposto = 0;
        }

        if(imposto == 0) {
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f", imposto);
        }
    }
}
