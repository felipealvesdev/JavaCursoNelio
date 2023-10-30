package exercicioFixacao1.application;

import exercicioFixacao1.entities.ImportedProduct;
import exercicioFixacao1.entities.Product;
import exercicioFixacao1.entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class secao14ExFix1Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scan.nextInt();

        List<Product> productsList = new ArrayList<>();

        for(int i = 0; i < numberOfProducts; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String productType = scan.next();
            scan.nextLine();

            if(productType.equalsIgnoreCase("c")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                Product product = new Product(name, price);
                productsList.add(product);

            }else if(productType.equalsIgnoreCase("u")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = null;
                try{
                    date = sdf.parse(scan.next());
                }catch(Exception e) {
                    System.out.println("invalid date");
                }
                Product product = new UsedProduct(name, price, date);
                productsList.add(product);

            }else if(productType.equalsIgnoreCase("i")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                productsList.add(product);

            }
        }

        System.out.printf("%nPRICE TAGS: %n");
        for(Product product : productsList) {
            System.out.println(product.priceTag());
        }
    }
}
