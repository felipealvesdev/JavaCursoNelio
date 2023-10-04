import java.util.Locale;
import java.util.Scanner;

public class secao08Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Insert name, grade one, grade two and grade three:");
        student1.name = scan.nextLine();
        student1.grade1 = scan.nextDouble();
        student1.grade2 = scan.nextDouble();
        student1.grade3 = scan.nextDouble();
        student1.showResult();
    }
}
