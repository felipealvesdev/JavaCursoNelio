package exercicioFixacao.application;

import exercicioFixacao.entities.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class secao11ExercicioFixacaoProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfWithHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = null;
        try{
            birthDate = sdf.parse(scan.next());
        } catch(Exception e) {
            System.out.println("Invalid date");
        }

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        scan.nextLine();
        String orderStatus = scan.nextLine();
        System.out.print("How many items to this order? ");
        int numberOfItems = scan.nextInt();

        Client client = new Client(name, email, birthDate);

        Order order = new Order(OrderStatus.valueOf(orderStatus), client);


        for(int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter #"+(i+1)+" item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + sdfWithHour.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") " +
                "- " + client.getEmail());
        System.out.println("Order items:");
        for(OrderItem item : order.getItems()) {
            System.out.println(item.getProduct().getName() + ", $" + item.getProduct().getPrice() +
                    ", Quantity: " + item.getQuantity() + ", " + "Subtotal: $" +
                    String.format("%.2f", item.subTotal()));
        }

        System.out.println("Total price: $"+ String.format("%.2f", order.total()));
    }
}
