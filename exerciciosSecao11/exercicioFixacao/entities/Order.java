package exercicioFixacao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for(OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
