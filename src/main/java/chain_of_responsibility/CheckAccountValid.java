package chain_of_responsibility;

public class CheckAccountValid extends BaseHandler {
    @Override
    public void handle(Object obj) {
        // Kiểm tra xem tài khoản có hợp lệ hay ko?
        Account account = (Account) obj;

        // Thực tế-> lấy từ Database ra để kiểm tra
        if (account.getEmail().equals("user@gmail.com") && account.getPassword().equals("user123")) {
            // Chuyển tiếp xử lý
            super.handle(obj);
        } else {
            // Ném ra exception -> ko có tài khoản
            throw new RuntimeException("Tài khoản không hợp lệ");
        }
    }
}
