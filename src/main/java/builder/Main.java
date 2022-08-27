package builder;

public class Main {
    public static void main(String[] args) {
        // tạo 1 đối tượng nhà 2 cửa sổ, 2 của ra vào, 1 phòng ngủ
        // và có gara
        House house1 = new House(2, 2, 1, true,
                false, false, false);
        // Kết luận: -> khó, rối khi tạo đối tượng
        // từ 4 thuộc tính=> Xây dựng builder để giúp tạo ra đối tượng
        // đơn giản hơn.
        System.out.println(house1);

        HouseBuilder houseBuilder = new HouseBuilder()
                .buildWindows(2)
                .buildDoors(2)
                .buildRooms(1)
                .buildGarage();

        House house2 = houseBuilder.create();

        House house3 = new HouseBuilder()
                .buildDoors(1)
                .buildGarage()
                .buildSwimPool().create();

        System.out.println(house2);

    }
}
