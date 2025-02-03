public class Product {
    private int productId;
    private String productName;
    private String description;
    private double price;
    private int stockQuantity;

    // Конструктор
    public Product(int productId, String productName, String description, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Геттеры и сеттеры
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Метод для вывода информации о продукте
    public void printProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    @Override
    public String toString() {
        return "Product{id=" + productId + ", name='" + productName + "', description='" + description + "', price=" + price + ", stockQuantity=" + stockQuantity + "}";
    }
}
