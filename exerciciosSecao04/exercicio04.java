import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        int number;
        double hoursWorked, salaryPerHour, salary;
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o numero do funcionario:");
        number = scan.nextInt();

        System.out.println("Insira a quantidade de horas trabalhadas:");
        hoursWorked = scan.nextDouble();

        System.out.println("Insira o salario por hora trabalhada do funcionario:");
        salaryPerHour = scan.nextDouble();

        salary = hoursWorked * salaryPerHour;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
