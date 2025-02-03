public class Admin extends Client {
    private String role;

    public Admin(int id, String name, String address, String phone, String email, String role) {
        super(id, name, address, phone, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() + ", Role: " + role;
    }
}

