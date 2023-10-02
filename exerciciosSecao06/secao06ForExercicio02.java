import java.util.Scanner;

public class secao06ForExercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem digitados:");
        int qtdInputs = scan.nextInt();
        int in = 0, out = 0, input;

        for(int i = 0; i < qtdInputs; i++){
            input = scan.nextInt();
            if (input >= 10 && input <= 20) {
                in++;
            }else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
