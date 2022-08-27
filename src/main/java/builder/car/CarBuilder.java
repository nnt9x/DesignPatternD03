package builder.car;

public class CarBuilder {
    private String id;
    private String name;
    private String brand;
    private String color;
    private Engine engine;
    private float price;
    private boolean hasGPS;
    private boolean hasSmartSystem;

    public CarBuilder setCarID(String id) {
        this.id = id;
        return this;
    }

    public CarBuilder selectCarColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setCarName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setCarBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setCarEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder selectCarPrice(float price) {
        this.price = price;
        return this;
    }

    public CarBuilder hasCarGPS(boolean gps) {
        this.hasGPS = gps;
        return this;
    }

    public CarBuilder hasSmartSystem(boolean system) {
        this.hasSmartSystem = system;
        return this;
    }

    public Car create() {
        return new Car(id, name, brand, color, engine, price, hasGPS, hasSmartSystem);
    }

}
