import java.util.Scanner;

public class secao06ForExercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor para saber os ímpares até x:");
        valor = scan.nextInt();

        for(int i = 0; i<=valor; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
