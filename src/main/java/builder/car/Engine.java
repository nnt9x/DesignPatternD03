package builder.car;

public class Engine {
    private String id;
    private EngineType engineType = EngineType.DIESEL;
    private double volume = 1.0;

    public Engine() {
    }

    public Engine(String id, EngineType engineType, double volume) {
        this.id = id;
        this.engineType = engineType;
        this.volume = volume;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id='" + id + '\'' +
                ", engineType=" + engineType +
                ", volume=" + volume +
                '}';
    }
}
