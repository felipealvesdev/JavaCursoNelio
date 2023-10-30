package exercicioResolvido1.application;

import exercicioResolvido1.entities.S14Employee;
import exercicioResolvido1.entities.S14OutSourcedEmplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class secao14ExRes1Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scan.nextInt();
        List<S14Employee> employeeList = new ArrayList<>();

        for(int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            String isOutSourced = scan.next();
            scan.nextLine();
            if(isOutSourced.equalsIgnoreCase("y")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = scan.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();

                S14Employee employee = new S14OutSourcedEmplyoee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            }else {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = scan.nextDouble();

                S14Employee employee = new S14Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(S14Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }
    }
}
