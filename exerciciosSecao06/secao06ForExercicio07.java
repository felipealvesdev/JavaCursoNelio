import java.util.Scanner;

public class secao06ForExercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de linhas N:");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(i + " " + i*i + " " + i*i*i);
        }
    }
}
