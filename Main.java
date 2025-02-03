import java.util.*;
import com.google.gson.Gson;  // Для работы с Gson

public class Main {
    public static void main(String[] args) {
        try {
            // Создание объектов клиентов и продуктов
            Client client = new Client(1, "John Doe", "123 Main St", "1234567890", "johndoe@email.com");

            // Создаем продукты
            Product product1 = new Product(1, "Product1", "High-quality product", 100.0, 50);

            // Создаем заказ с этим продуктом
            Order order = new Order(1, product1, 2);  // 2 товара по 100.0

            Invoice invoice = new Invoice(1, 1, 200.0, "2025-01-27");
            Transaction transaction = new Transaction(1, 1, 1, 200.0, new Date());

            // Добавление объектов в соответствующие списки
            List<Client> clients = new ArrayList<>();
            clients.add(client);

            List<Order> orders = new ArrayList<>();
            orders.add(order);

            List<Invoice> invoices = new ArrayList<>();
            invoices.add(invoice);

            List<Transaction> transactions = new ArrayList<>();
            transactions.add(transaction);

            // Сохранение данных в JSON
            DatabaseHandler.saveClient(clients);
            DatabaseHandler.saveOrder(orders);
            DatabaseHandler.saveInvoice(invoices);

            // Вывод сохраненных данных
            System.out.println("Client saved: " + client);
            System.out.println("Order saved: " + order);
            System.out.println("Invoice saved: " + invoice);
            System.out.println("Transaction saved: " + transaction);

            // Загрузка данных из JSON
            System.out.println("Loaded Clients:");
            for (Client c : DatabaseHandler.loadClients()) {
                System.out.println(c);
            }

            System.out.println("Loaded Orders:");
            for (Order o : DatabaseHandler.loadOrders()) {
                System.out.println(o);
            }

            System.out.println("Loaded Invoices:");
            for (Invoice i : DatabaseHandler.loadInvoices()) {
                System.out.println(i);
            }

            // Генерация отчетов
            Report.generateClientReport(clients);
            Report.generateOrderReport(orders);
            Report.generateTransactionReport(transactions);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
