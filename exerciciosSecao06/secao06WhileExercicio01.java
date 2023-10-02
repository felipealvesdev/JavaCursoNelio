import java.util.Scanner;

public class secao06WhileExercicio01 {
    public static void main(String[] args) {
        int senhaSalva = 2002;
        int input;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua senha:");
        input = scan.nextInt();

        while(input != senhaSalva) {
            System.out.println("Senha invalida");
            System.out.println("Insira sua senha:");
            input = scan.nextInt();
        }

        System.out.println("Acesso permitido");
    }
}
