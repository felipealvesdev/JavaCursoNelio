package exercicioFixacao1.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return (super.getName() + " (used) $ " + String.format("%.2f",super.getPrice()) +
                " (Manufacture date: " + sdf.format(this.manufactureDate) + ")");
    }
}
