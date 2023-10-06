import java.util.Locale;
import java.util.Scanner;

public class secao09Exercicio01 {
    public static void main(String[] args) {

        boolean hasInitialDeposit = false;
        boolean isUsingAccount = true;
        Client client;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to create a new bank account and make an initial deposit?" +
                " Y-Yes, N-No:");
        String initialDepositAnswer = scan.next();

        if(initialDepositAnswer.equalsIgnoreCase("Y")) {

            System.out.println("Insert your name and initial account deposit value:");
            scan.nextLine();
            String providedName = scan.nextLine();
            double providedValue = scan.nextDouble();
            client = new Client(providedName, providedValue);
        }else {
            System.out.println("Insert your name:");
            scan.nextLine();
            String providedName = scan.nextLine();
            client = new Client(providedName);
        }

        while (isUsingAccount) {
            System.out.println("SELECT 1- DEPOSIT, 2- WITHDRAW, 3- CHANGE ACCOUNT NAME, " +
                    "4- SHOW INFO ABOUT ACCOUNT, 5- EXIT PROGRAM ");
            int currentUseSelected = scan.nextInt();
            if(currentUseSelected == 1) {
                System.out.println("Insert deposit value:");
                double value = scan.nextDouble();
                client.deposit(value);
                System.out.printf("%.2f has been added to your account.%n" , value);
            }else if (currentUseSelected == 2) {
                System.out.println("Insert withdraw value:");
                double value = scan.nextDouble();
                client.withdraw(value);
                System.out.printf("%.2f has been withdrawn from your account and you paid $5 fee%n" , value);
            }else if(currentUseSelected == 3){
                String previousName = client.getName();
                System.out.println("Insert new name:");
                scan.nextLine();
                String newName = scan.nextLine();
                client.setName(newName);
                System.out.println("Your name has been changed from " + previousName + " to " +
                        newName);
            }else if(currentUseSelected == 4) {
                System.out.println("Account information:");
                System.out.println("Account id: " + client.getId());
                System.out.println("Name: " + client.getName());
                System.out.println("Account total amount: " + client.getTotalAmount());
            }else if(currentUseSelected == 5) {
                isUsingAccount = false;
                System.out.println("THANK YOU FOR USING OUR BANK.");
                break;
            }
        }
    }
}
