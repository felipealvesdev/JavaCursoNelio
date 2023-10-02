import java.util.Scanner;

public class secao06ForExercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o numero N que deseja saber todos os seus divisores:");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
