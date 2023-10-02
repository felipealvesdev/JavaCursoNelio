import java.util.Locale;
import java.util.Scanner;

public class secao05Exercicio06 {
    public static void main(String[] args) {
        double num1;
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira um valor:");
        num1 = scan.nextDouble();

        if(num1 >= 0 && num1 <=25) {
            System.out.println("Intervalo [0,25]");
        }else if(num1 > 25 && num1 <=50) {
            System.out.println("Intervalo (25,50]");
        }else if(num1 > 50 && num1 <=75) {
            System.out.println("Intervalo (50,75]");
        }else if(num1 > 75 && num1 <=100) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
    }
}
