package chain_of_responsibility;

public class CheckBalanceAvailable extends BaseHandler {
    @Override
    public void handle(Object obj) {
        Account account = (Account) obj;
        if(account.getBalance() > 0){
            super.handle(obj);
        }
        else {
            throw new RuntimeException("Số dư không đủ");
        }
    }
}
