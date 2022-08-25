package builder;

public class HouseBuilder implements Builder<HouseBuilder> {

    // Có các thuộc tính giống hệt với với House
    private int windows = 1;
    private int doors = 1;
    private int rooms = 1;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasStatues;
    private boolean hasGarden;

    public HouseBuilder() {

    }

    @Override
    public HouseBuilder buildWindows(int quantity) {
        this.windows = quantity;
        return this;
    }

    @Override
    public HouseBuilder buildDoors(int quantity) {
        this.doors = quantity;
        return this;
    }

    @Override
    public HouseBuilder buildRooms(int quantity) {
        this.rooms = quantity;
        return this;
    }

    @Override
    public HouseBuilder buildGarage() {
        this.hasGarage = true;
        return this;
    }

    @Override
    public HouseBuilder buildGarden() {
        this.hasGarden = true;
        return this;
    }

    @Override
    public HouseBuilder buildSwimPool() {
        this.hasSwimPool = true;
        return this;
    }

    @Override
    public HouseBuilder buildStatues() {
        this.hasStatues = true;
        return this;
    }

    @Override
    public House create() {
        return new House(windows, doors, rooms, hasGarage, hasSwimPool, hasStatues, hasGarden);

    }
}
