import java.util.Scanner;

public class secao06WhileExercicio03 {
    public static void main(String[] args) {

        int qtdClientesAlcool=0, qtdClientesGasolina = 0, qtdClientesDiesel = 0;
        int tipoCombustivel = 0;
        Scanner scan = new Scanner(System.in);

        while(tipoCombustivel != 4) {

            System.out.println("Insira o tipo de combustivel: ");
            tipoCombustivel = scan.nextInt();

            if (tipoCombustivel == 1) {
                qtdClientesAlcool++;
            }else if (tipoCombustivel == 2) {
                qtdClientesGasolina++;
            }else if (tipoCombustivel == 3) {
                qtdClientesDiesel++;
            }else if (tipoCombustivel == 4) {
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + qtdClientesAlcool);
                System.out.println("Gasolina: " + qtdClientesGasolina);
                System.out.println("Diesel: " + qtdClientesDiesel);
            }
        }
    }
}
