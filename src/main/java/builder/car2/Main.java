package builder.car2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .setCarID("Model X")
                .setCarBrand("Tesla")
                .setCarName("Tesla Model X")
                .setCarEngine(new Engine("X1", EngineType.ELECTRIC, 3))
                .hasCarGPS(true)
                .hasSmartSystem(true)
                .create();
        System.out.println(car1);
    }
}
