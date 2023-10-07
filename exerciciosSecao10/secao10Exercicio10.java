import java.util.Locale;
import java.util.Scanner;

public class secao10Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdAlunos;
        Aluno[] alunos;
        String[] aprovados;

        System.out.print("Quantos alunos serao digitados? ");
        qtdAlunos = scan.nextInt();
        alunos = new Aluno[qtdAlunos];
        aprovados = new String[qtdAlunos];

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
            scan.nextLine();
            String tempNome = scan.nextLine();
            double tempNota1 = scan.nextDouble();
            double tempNota2 = scan.nextDouble();

            Aluno aluno = new Aluno(tempNome, tempNota1, tempNota2);
            double tempMedia = (tempNota1 + tempNota2) / 2;

            if(tempMedia >= 6) {
                aprovados[i] = tempNome;
            }
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < aprovados.length; i++) {
            if(aprovados[i] != null) {
                System.out.println(aprovados[i]);
            }
        }

    }
}
