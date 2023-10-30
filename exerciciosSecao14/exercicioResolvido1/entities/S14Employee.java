package exercicioResolvido1.entities;

public class S14Employee {
    private String name;
    private Integer hours;
    private double valuePerHour;

    public S14Employee(String name, Integer hours, double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHours() {
        return hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public double payment() {
        return valuePerHour * hours;
    }
}
