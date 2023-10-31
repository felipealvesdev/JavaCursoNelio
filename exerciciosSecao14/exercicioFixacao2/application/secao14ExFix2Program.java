package exercicioFixacao2.application;

import exercicioFixacao2.entities.Pessoa;
import exercicioFixacao2.entities.PessoaFisica;
import exercicioFixacao2.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class secao14ExFix2Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPayers = scan.nextInt();

        List<Pessoa> pessoasLista = new ArrayList<>();

        for(int i = 0; i < numberTaxPayers; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            String answer = scan.next();
            scan.nextLine();
            if(answer.equalsIgnoreCase("i")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scan.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                System.out.println(name +" " + anualIncome + " " + healthExpenditures);

                Pessoa pessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
                pessoasLista.add(pessoa);

            }else if(answer.equalsIgnoreCase("c")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = scan.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmployees = scan.nextInt();

                Pessoa pessoa = new PessoaJuridica(name, anualIncome, numberEmployees);
                pessoasLista.add(pessoa);

            }
        }

        double taxesSum = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Pessoa pessoa : pessoasLista) {
            System.out.println(pessoa.getNome() + " $ " + String.format("%.2f", pessoa.verImpostoAPagar()));
            taxesSum += pessoa.verImpostoAPagar();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", taxesSum));
    }
}
