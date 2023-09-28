import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        double valorA, valorB, valorC, areaTriangulo, areaCirculo, areaTrapezio,
                areaQuadrado, areaRetangulo;
        final double PI = 3.14159;

        System.out.println("Insira o valor de A, B e C:");
        valorA = scan.nextDouble();
        valorB = scan.nextDouble();
        valorC = scan.nextDouble();

        areaTriangulo = (valorA * valorC) / 2;
        areaCirculo = PI * (valorC * valorC);
        areaTrapezio = ((valorA + valorB) * valorC) / 2;
        areaQuadrado = valorB * valorB;
        areaRetangulo = valorA * valorB;

        System.out.printf("TRIANGULO: %.3f \n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f \n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f \n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f \n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f \n", areaRetangulo);

    }
}
