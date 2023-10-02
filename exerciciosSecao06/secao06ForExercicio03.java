import java.util.Locale;
import java.util.Scanner;

public class secao06ForExercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPonderada;
        System.out.println("Insira o numero de casos:");
        int numeroCasos = scan.nextInt();

        for(int i = 0; i<numeroCasos; i++) {

            System.out.println("Insira a 1 nota");
            nota1 = scan.nextDouble();
            System.out.println("Insira a 2 nota");
            nota2 = scan.nextDouble();
            System.out.println("Insira a 3 nota");
            nota3 = scan.nextDouble();

            mediaPonderada = ( (nota1*2) + (nota2*3) + (nota3*5) ) / (2+3+5);
            System.out.printf("%.1f%n", mediaPonderada);
        }
    }
}
