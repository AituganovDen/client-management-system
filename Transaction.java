import java.util.Date;

public class Transaction {
    private int transactionId;
    private int clientId;
    private int orderId;
    private double totalAmount;
    private Date transactionDate;

    public Transaction(int transactionId, int clientId, int orderId, double totalAmount, Date transactionDate) {
        this.transactionId = transactionId;
        this.clientId = clientId;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.transactionDate = transactionDate;
    }

    // Геттеры и сеттеры
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public Date getTransactionDate() { return transactionDate; }
    public void setTransactionDate(Date transactionDate) { this.transactionDate = transactionDate; }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", clientId=" + clientId +
                ", orderId=" + orderId +
                ", totalAmount=" + totalAmount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}

