import java.util.Locale;
import java.util.Scanner;

public class secao08Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter name, gross salary and tax:");
        employee.name = scan.nextLine();
        employee.grossSalary = scan.nextDouble();
        employee.tax = scan.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());

        System.out.println("Which percentage to increase salary?");
        employee.increaseSalary(scan.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());
    }
}
