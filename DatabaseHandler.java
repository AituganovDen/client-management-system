import com.google.gson.*;
import java.io.*;
import java.util.*;
import com.google.gson.reflect.TypeToken;


public class DatabaseHandler {
    private static final String CLIENT_FILE = "clients.json";
    private static final String ORDER_FILE = "orders.json";
    private static final String INVOICE_FILE = "invoices.json";

    // Сохранение данных клиентов в JSON
    public static void saveClient(List<Client> clients) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(CLIENT_FILE)) {
            gson.toJson(clients, writer);  // Сохраняем список клиентов как JSON-массив
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Сохранение данных заказов в JSON
    public static void saveOrder(List<Order> orders) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(ORDER_FILE)) {
            gson.toJson(orders, writer);  // Сохраняем список заказов как JSON-массив
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Сохранение данных счетов в JSON
    public static void saveInvoice(List<Invoice> invoices) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(INVOICE_FILE)) {
            gson.toJson(invoices, writer);  // Сохраняем список счетов как JSON-массив
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Загрузка данных клиентов из JSON
    public static List<Client> loadClients() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(CLIENT_FILE)) {
            return gson.fromJson(reader, new TypeToken<List<Client>>(){}.getType());  // Загружаем как список клиентов
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Загрузка данных заказов из JSON
    public static List<Order> loadOrders() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(ORDER_FILE)) {
            return gson.fromJson(reader, new TypeToken<List<Order>>(){}.getType());  // Загружаем как список заказов
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Загрузка данных счетов из JSON
    public static List<Invoice> loadInvoices() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(INVOICE_FILE)) {
            return gson.fromJson(reader, new TypeToken<List<Invoice>>(){}.getType());  // Загружаем как список счетов
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
