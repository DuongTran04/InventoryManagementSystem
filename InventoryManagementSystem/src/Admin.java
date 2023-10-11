public class Admin extends User {
    private int seniorityLevel;

    public Admin(String ID, String name, int phone, String email, String password, int seniorityLevel) {
        super(ID, name, phone, email, password);
        this.seniorityLevel = seniorityLevel;
    }

    public int getSeniorityLevel() {
        return seniorityLevel;
    }

    public void updateNormalUser(NormalUser user, String ID, String name, int phone, String email) {
        user.setID(ID);
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
    }


}