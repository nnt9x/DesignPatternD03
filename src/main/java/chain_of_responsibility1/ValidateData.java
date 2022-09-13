package chain_of_responsibility1;

import java.util.List;

public class ValidateData extends BaseHandler {
    @Override
    public void handle(Object obj) {
        User user = (User) obj;
        if (user.getUserName().length() > 8 && user.getPassword().length() > 6) {
            super.handle(obj);
        } else {
            throw new RuntimeException("Dữ liệu không hợp lệ");
        }
    }
}
