package chain_of_responsibility1;

import java.util.List;

public class CheckExitsUser extends BaseHandler {
    @Override
    public void handle(Object obj) {
        User user = (User) obj;
        // Lấy ra danh sách
        List<User> userList = UserManager.getInstance().getAllUser();
        // Username duy nhất.
        for (User item : userList) {
            if (item.getUserName().equals(user.getUserName())) {
                throw new RuntimeException("Đã tồn tại tài khoản");
            }
        }
        super.handle(obj);
    }
}
