import java.util.Scanner;

public class secao05Exercicio04 {
    public static void main(String[] args) {

        int horaInicial, horaFinal, total;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, insira a hora inicial do jogo com números inteiros:");
        horaInicial = scan.nextInt();
        System.out.println("Por favor, insira a hora final do jogo com números inteiros:");
        horaFinal = scan.nextInt();

        if(horaInicial > horaFinal) {
            total = 24-horaInicial + horaFinal;
        } else if( horaInicial == horaFinal) {
            total = 24;
        } else {
            total = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU "+ total +" HORA(S)");
    }
}
