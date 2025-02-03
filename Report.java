import java.util.List;

public class Report {

    public static void generateClientReport(List<Client> clients) {
        System.out.println("Client Report:");
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public static void generateOrderReport(List<Order> orders) {
        System.out.println("Order Report:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void generateTransactionReport(List<Transaction> transactions) {
        System.out.println("Transaction Report:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}

