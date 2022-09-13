package chain_of_responsibility;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public void handle(Object obj) {
        if (next != null) {
            next.handle(obj);
        }
    }
}
