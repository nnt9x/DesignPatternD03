package chain_of_responsibility1;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    // Quản lý tài khoản
    private List<User> list;
    private static UserManager userManager = null;

    // Singleton
    private UserManager() {
        list = new ArrayList<>();
    }

    public static UserManager getInstance() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    public List<User> getAllUser() {
        return list;
    }

    public void addUser(User user) {
        list.add(user);
    }

}
