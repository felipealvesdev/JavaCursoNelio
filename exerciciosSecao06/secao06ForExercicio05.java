import java.util.Scanner;

public class secao06ForExercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o numero que deseja saber o fatorial dele:");
        int numeroParaFatorial = scan.nextInt();
        int total = 1;

        for(int i = numeroParaFatorial; i > 0; i--) {
            total *= i;
        }

        System.out.println(total);




    }
}
