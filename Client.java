public class Client {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    // Конструктор с проверками
    public Client(int id, String name, String address, String phone, String email) {
        this.id = id;
        setName(name);  // Используем сеттер для проверки данных
        setAddress(address);
        setPhone(phone);
        setEmail(email);
    }

    // Геттеры и сеттеры
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = address;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone must be a valid 10-digit number");
        }
        this.phone = phone;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{id=" + id + ", name='" + name + "', address='" + address + "', phone='" + phone + "', email='" + email + "'}";
    }
}
