package chain_of_responsibility1;

import java.util.List;

public interface Handler {
    public void setNext(Handler next);

    public void handle(Object request);
}
