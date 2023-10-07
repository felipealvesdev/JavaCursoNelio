import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdPessoas;
        Pessoa[] pessoas;
        String[] vetorNomes;
        int[] vetorIdades;


        System.out.print("Quantas pessoas voce vai digitar? ");
        qtdPessoas = scan.nextInt();

        pessoas = new Pessoa[qtdPessoas];
        vetorNomes = new String[qtdPessoas];
        vetorIdades = new int[qtdPessoas];


        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            scan.nextLine();
            String tempNome = scan.nextLine();
            System.out.print("Idade: ");
            int tempIdade = scan.nextInt();

            Pessoa pessoa = new Pessoa(tempNome, tempIdade);
            vetorNomes[i] = pessoa.getNome();
            vetorIdades[i] = pessoa.getIdade();
        }

        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";

        for(int i = 0; i < vetorIdades.length; i++) {
            if(vetorIdades[i] >= idadeMaisVelho) {
                idadeMaisVelho = vetorIdades[i];
                nomeMaisVelho = vetorNomes[i];
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
    }
}
