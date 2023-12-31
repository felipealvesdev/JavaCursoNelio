package exercicioFixacao1.entities;

public class ImportedProduct extends Product{

    private double customsFee;
    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return super.getPrice() + this.customsFee;
    }

    @Override
    public String priceTag(){
        return (super.getName() + " $ " +
                String.format("%.2f", totalPrice()) +
                " (Customs fee: $ " + String.format("%.2f", customsFee) + ")");
    }
}
