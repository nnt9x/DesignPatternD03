package builder.car2;

public class Car {
    private String id;
    private String name;
    private String brand;
    private String color;
    private Engine engine;
    private float price;
    private boolean hasGPS;
    private boolean hasSmartSystem;

    private Car(String id, String name, String brand, String color, Engine engine, float price, boolean hasGPS, boolean hasSmartSystem) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.price = price;
        this.hasGPS = hasGPS;
        this.hasSmartSystem = hasSmartSystem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public boolean isHasSmartSystem() {
        return hasSmartSystem;
    }

    public void setHasSmartSystem(boolean hasSmartSystem) {
        this.hasSmartSystem = hasSmartSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                ", hasGPS=" + hasGPS +
                ", hasSmartSystem=" + hasSmartSystem +
                '}';
    }

    // Thêm class Builder ngay tại đây
    static class Builder {
        private String id;
        private String name;
        private String brand;
        private String color;
        private Engine engine;
        private float price;
        private boolean hasGPS;
        private boolean hasSmartSystem;

        public Builder setCarID(String id) {
            this.id = id;
            return this;
        }

        public Builder selectCarColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCarName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCarBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCarEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder selectCarPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder hasCarGPS(boolean gps) {
            this.hasGPS = gps;
            return this;
        }

        public Builder hasSmartSystem(boolean system) {
            this.hasSmartSystem = system;
            return this;
        }

        public Car create() {
            return new Car(id, name, brand, color, engine, price, hasGPS, hasSmartSystem);
        }
    }
}
