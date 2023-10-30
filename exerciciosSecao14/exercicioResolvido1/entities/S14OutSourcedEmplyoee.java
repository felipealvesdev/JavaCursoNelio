package exercicioResolvido1.entities;

public class S14OutSourcedEmplyoee extends S14Employee{

    private double additionalCharge;

    public S14OutSourcedEmplyoee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + (this.additionalCharge * 1.1);
    }
}
