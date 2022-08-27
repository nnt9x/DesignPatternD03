package builder.car;

public class Main {
    public static void main(String[] args) {
        // Thử tạo xe bằng builder
        Car car1;
        CarBuilder builder = new CarBuilder()
                .setCarID("Model X")
                .setCarName("Tesla Model X")
                .setCarEngine(new Engine("X1", EngineType.ELECTRIC, 3))
                .hasCarGPS(true)
                .hasSmartSystem(true)
                .selectCarColor("Red")
                .selectCarPrice(50000);
        car1 = builder.create();
        System.out.println(car1);

//        Car car2 = new Car();
    }
}
