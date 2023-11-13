package exercicioFixacao1.application;

import exercicioFixacao1.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class secao17ExFix1Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String path = "c:\\Users\\Felipe\\Documents\\Intellij\\CursoJavaNelioAlves\\exerciciosSecao17\\exercicioFixacao1\\extras\\arquivo.csv";
        List<Product> productsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null) {

                String[] arrOfString = line.split(",");
                String productName = arrOfString[0];
                double productPrice = Double.parseDouble(arrOfString[1]);
                int productQuantity = Integer.parseInt(arrOfString[2]);

                Product product = new Product(productName, productPrice, productQuantity);
                productsList.add(product);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for(Product p : productsList) {
            System.out.println(p.getName() + ", " + String.format("%.2f", p.totalPrice()));
        }
    }
}
