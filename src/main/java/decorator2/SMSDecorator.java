package decorator2;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Gửi tiếp thông báo đến tin nhắn SMS");
    }
}
