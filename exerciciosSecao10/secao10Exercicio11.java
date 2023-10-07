import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdPessoas;
        PessoaGenero[] pessoas;
        double maiorAltura = 0;
        double menorAltura = 100;
        double somaAlturaMulheres = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        System.out.print("Quantas pessoas serao digitadas? ");
        qtdPessoas = scan.nextInt();
        pessoas = new PessoaGenero[qtdPessoas];

        for(int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double tempAltura = scan.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            scan.nextLine();
            String tempGenero = scan.nextLine();

            PessoaGenero pessoa = new PessoaGenero(tempAltura, tempGenero);
            if(tempGenero.equalsIgnoreCase("m")) {
                qtdHomens++;
            }else if(tempGenero.equalsIgnoreCase("f")) {
                somaAlturaMulheres += tempAltura;
                qtdMulheres++;
            }
            if(tempAltura >= maiorAltura) {
                maiorAltura = tempAltura;
            }
            if(tempAltura <= menorAltura) {
                menorAltura = tempAltura;
            }
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das altura das mulheres = %.2f%n", (somaAlturaMulheres / qtdMulheres));
        System.out.println("Numero de homens: " + qtdHomens);
    }
}
