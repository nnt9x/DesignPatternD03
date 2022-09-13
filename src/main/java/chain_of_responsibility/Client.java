package chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        // Tạo 1 account:
        Account acc1 = new Account(1, "Account 1", "A17", 10, "user@gmail.com", "" +
                "user123");

        Handler checkTaiKhoan = new CheckAccountValid();
        Handler checkSoDu = new CheckBalanceAvailable();
        Handler checkOut = new CheckoutSuccess();

        // Thứ tự thực hiện
        checkTaiKhoan.setNext(checkSoDu);
        checkSoDu.setNext(checkOut);

        checkTaiKhoan.handle(acc1);
    }
}
