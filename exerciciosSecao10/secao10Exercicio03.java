import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdPessoas;
        Pessoa[] listaPessoas;
        double somaAltura = 0;
        int qtdMenor16Anos = 0;
        String[] nomesMenor16Anos;

        System.out.printf("Quantas pessoas serao digitadas? ");
        qtdPessoas = scan.nextInt();

        listaPessoas = new Pessoa[qtdPessoas];
        nomesMenor16Anos = new String[qtdPessoas];

        for(int i = 0; i < listaPessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.printf("%nNome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.printf("%nIdade: ");
            int idade = scan.nextInt();
            System.out.printf("%nAltura: ");
            double altura = scan.nextDouble();

            Pessoa pessoa = new Pessoa(nome, idade, altura);
            listaPessoas[i] = pessoa;

            somaAltura += pessoa.getAltura();
            if(pessoa.getIdade() < 16) {
                nomesMenor16Anos[qtdMenor16Anos] = pessoa.getNome();
                qtdMenor16Anos++;
            }
        }

        System.out.printf("%nAltura média: %.2f%n", (somaAltura / qtdPessoas));

        System.out.println("Pessoas com menos de 16 anos: " + (((double) qtdMenor16Anos / qtdPessoas) *100) + "%");
        for(int i = 0; i < nomesMenor16Anos.length; i++) {
            if(nomesMenor16Anos[i] == null){
                continue;
            }
            System.out.println(nomesMenor16Anos[i]);
        }
    }
}
