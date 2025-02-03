public class Order {
    private int orderId;
    private Product product;  // Связь с продуктом
    private int quantity;
    private double price;

    // Конструктор
    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = product.getPrice() * quantity; // Цена = цена продукта * количество
    }

    // Геттеры и сеттеры
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        this.price = product.getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.price = product.getPrice() * quantity; // Перерасчет цены при изменении количества
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", product=" + product.getProductName() + ", quantity=" + quantity + ", price=" + price + "}";
    }
}
