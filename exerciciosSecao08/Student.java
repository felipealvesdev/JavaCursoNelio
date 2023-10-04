public class Student {

    String name;
    double grade1, grade2, grade3;

    public double gradeSum() {
        return this.grade1 + this.grade2 + this.grade3;
    }

    public void showResult() {
        if(gradeSum()>=60) {
            System.out.printf("FINAL GRADE = %.2f%n", gradeSum());
            System.out.println("PASS");
        }else {
            System.out.printf("FINAL GRADE = %.2f%n", gradeSum());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", (60 - gradeSum()));
        }
    }




}
