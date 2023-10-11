import java.util.ArrayList;
import java.util.List;

public class AdminManager {
    private List<Admin> admins;

    public AdminManager() {
        this.admins = new ArrayList<>();
    }

    public void addAdmin(Admin admin) {
        this.admins.add(admin);
    }

    public void deleteAdmin(Admin admin1, Admin admin2) { // admin1 tries to delete admin2
        if (admin1.getSeniorityLevel() > admin2.getSeniorityLevel()) {
            this.admins.remove(admin2);
        }
    }

    public Admin getAdmin(String ID) {
        for (Admin admin : admins) {
            if (admin.getID().equals(ID)) {
                return admin;
            }
        }
        return null; // Admin not found
    }

    public void updateAdmin(Admin admin1, Admin admin2, String ID, String name, int phone, String email) { // admin1 tries to update admin2
        if (admin1.getSeniorityLevel() > admin2.getSeniorityLevel()) {
            admin2.setID(ID);
            admin2.setName(name);
            admin2.setPhone(phone);
            admin2.setEmail(email);
        }
    }


}
