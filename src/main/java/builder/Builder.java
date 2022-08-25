package builder;

// Generic
public interface Builder<T> {
    public T buildWindows(int quantity);

    public T buildDoors(int quantity);

    public T buildRooms(int quantity);

    public T buildGarage();

    public T buildGarden();

    public T buildSwimPool();

    public T buildStatues();

    public House create();

}
