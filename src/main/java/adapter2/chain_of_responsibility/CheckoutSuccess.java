package adapter2.chain_of_responsibility;

public class CheckoutSuccess extends BaseHandler {
    @Override
    public void handle(Object obj) {
        Account account = (Account) obj;
        String out = String.format("Khách hàng %s, đặt hàng thành công!", account.getName());
        System.out.println(out);
        super.handle(obj);
    }
}
