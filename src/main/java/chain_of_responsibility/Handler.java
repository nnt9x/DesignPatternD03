package chain_of_responsibility;

public interface Handler {
    public void setNext(Handler h);

    public void handle(Object obj);
}
