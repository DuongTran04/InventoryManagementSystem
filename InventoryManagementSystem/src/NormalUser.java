public class NormalUser extends User {
    public NormalUser(String ID, String name, int phone, String email, String password) {
        super(ID, name, phone, email, password);
    }

    public void requestUpdate(Admin admin, String ID, String name, int phone, String email) {
        admin.updateNormalUser(this, ID, name, phone, email);
    }
}

