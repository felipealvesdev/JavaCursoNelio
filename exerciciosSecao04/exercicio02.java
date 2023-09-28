import java.util.Locale;
import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double raio, area;
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo:");
        raio = scan.nextDouble();
        area = PI*(raio*raio);
        System.out.printf("A=%.4f",area);
    }
}
