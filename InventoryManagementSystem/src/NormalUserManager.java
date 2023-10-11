import java.util.ArrayList;
import java.util.List;

public class NormalUserManager {
    private List<NormalUser> users;

    public NormalUserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(NormalUser user) {
        this.users.add(user);
    }

    public void deleteUser(NormalUser user) {
        this.users.remove(user);
    }

    public NormalUser getUser(String ID) {
        for (NormalUser user : users) {
            if (user.getID().equals(ID)) {
                return user;
            }
        }
        return null; // User not found
    }

    public void updateUser(Admin admin, NormalUser user, String ID, String name, int phone, String email) {
        if (admin != null) { // Only an admin can update a user
            user.setID(ID);
            user.setName(name);
            user.setPhone(phone);
            user.setEmail(email);
        }
    }
}

