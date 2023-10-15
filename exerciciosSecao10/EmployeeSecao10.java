import java.util.ArrayList;
import java.util.List;

public class EmployeeSecao10 {
    private int id;
    private String name;
    private double salary;

    EmployeeSecao10(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary * percentage / 100);
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }
}
