import java.util.Scanner;

public class secao05Exercicio05 {
    public static void main(String[] args) {

        int codigoItem, qtdItem;
        double totalComprado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o código do item:");
        codigoItem = scan.nextInt();
        System.out.println(("Por favor, insira a quantidade de itens do código "+ codigoItem));
        qtdItem = scan.nextInt();

        if(codigoItem == 1) {
            totalComprado = 4*qtdItem;
        }else if(codigoItem == 2) {
            totalComprado = 4.5*qtdItem;
        }else if(codigoItem == 3) {
            totalComprado = 5*qtdItem;
        }else if(codigoItem == 4) {
            totalComprado = 2*qtdItem;
        }else if(codigoItem == 5) {
            totalComprado = 1.5*qtdItem;
        }else {
            totalComprado = 0;
        }

        System.out.printf("Total: R$ %.2f", totalComprado);
    }
}
