package exercicioFixacao.entities;

public class OrderItem {

    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double subTotal() {
        return this.product.getPrice() * quantity;
    }

}
