import java.util.Locale;
import java.util.Scanner;

public class secao05Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x, y;
        String quadrante;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira as coordenadas dos pontos para saber" +
                " o quadrante do ponto:");

        System.out.println("Por favor, insira o valor da coordenada no eixo X:");
        x = scan.nextDouble();
        System.out.println("Por favor, insira o valor da coordenada no eixo Y:");
        y = scan.nextDouble();

        if (x > 0 && y > 0) {
            quadrante = "Q1";
        }else if (x < 0 && y > 0) {
            quadrante = "Q2";
        }else if (x < 0 && y < 0) {
            quadrante = "Q3";
        }else if (x > 0 && y < 0) {
            quadrante = "Q4";
        }else if (x == 0 && y == 0) {
            quadrante = "Origem";
        }else if (x != 0 && y == 0) {
            quadrante = "Eixo X";
        }else if (x == 0 && y != 0) {
            quadrante = "Eixo Y";
        }else {
            quadrante = "Erro";
        }

        System.out.println(quadrante);
    }
}
