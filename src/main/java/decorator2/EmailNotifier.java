package decorator2;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("To: designpattern@gmail.com");
        System.out.println("Messages:" + message);
    }
}
