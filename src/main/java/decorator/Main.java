package decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        // Muốn vẽ ra 1 hình tròn co viền màu đỏ. => theo bt -> sửa code.
        // Xây 1 lớp decorator (1 lớp bọc) để thêm tính năng setBorderColor.

        Shape shapeDecorator = new ShapeDecorator(new Circle(), "red");
        shapeDecorator.draw();
    }
}
