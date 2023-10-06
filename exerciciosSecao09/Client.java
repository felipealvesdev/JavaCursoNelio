public class Client {

    private static int globalId = 0;
    private int id;
    private String name;
    private double totalAmount;
    private final double FEE = 5;

    Client(String name, double initialAmount) {
        this.id = globalId++;
        this.name = name;
        this.totalAmount = initialAmount;
    }
    Client(String name) {
        this.name = name;
        this.totalAmount = 0;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void deposit(double value) {
        if(value != 0 && value>0) {
            this.totalAmount += value;
        }
    }

    public void withdraw(double value) {
        if(value != 0 && value > 0) {
            this.totalAmount -= value + FEE;
        }
    }
}
