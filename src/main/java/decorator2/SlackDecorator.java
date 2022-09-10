package decorator2;

public class SlackDecorator extends BaseDecorator{
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Gửi tiếp thông báo đến Slack");
    }
}
