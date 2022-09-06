package adapter.mysystem;

public interface Calculator<T> {
    public T plus(T... arr);

    public T min(T... arr);

    public T mul(T... arr);

    public T div(T... arr);
}
