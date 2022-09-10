package decorator2;

public abstract class BaseDecorator implements Notifier {
    protected Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

}
