package exercicioFixacao1.application;

import exercicioFixacao1.model.Exception.NotEnoughBalanceError;
import exercicioFixacao1.model.Exception.NotEnoughWithdrawLimitError;
import exercicioFixacao1.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class secao15ExFix1Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account data:");

        try{
            System.out.print("Number: ");
            int accountNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("Holder: ");
            String holderName = scan.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            Account account = new Account(accountNumber, holderName, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amountForWithdraw = scan.nextDouble();

            account.withdraw(amountForWithdraw);

        }catch(NotEnoughWithdrawLimitError e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }catch(NotEnoughBalanceError e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
