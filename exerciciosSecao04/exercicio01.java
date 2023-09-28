import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        int num01, num02, soma;
        Scanner scan = new Scanner(System.in);

        num01 = scan.nextInt();
        num02 = scan.nextInt();
        soma = num01 + num02;
        System.out.println("SOMA = "+ soma);
    }
}
