import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("How many employees will be registered? ");
        int EmployeesWillRegister = scan.nextInt();

        List<EmployeeSecao10> EmployeeList = new ArrayList<>();

        for(int i = 0; i < EmployeesWillRegister; i++) {
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("Id: ");
            int id = scan.nextInt();
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            EmployeeSecao10 Employee = new EmployeeSecao10( id, name, salary);
            EmployeeList.add(Employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncreaseSalary = scan.nextInt();
        boolean salaryIncreased = false;

        for(EmployeeSecao10 employee : EmployeeList ) {
            if(employee.getId() == idToIncreaseSalary) {
                System.out.print("Enter the percentage: ");
                employee.increaseSalary(scan.nextDouble());
                salaryIncreased = true;
                break;
            }
        }
        if(!salaryIncreased) {
            System.out.println("This id does not exist!");
        }

        System.out.printf("%nList of employees:%n");
        for(EmployeeSecao10 employee : EmployeeList) {
         System.out.println(employee.toString());
        }
    }
}
