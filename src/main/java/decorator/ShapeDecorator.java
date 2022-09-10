package decorator;

public class ShapeDecorator implements Shape {
    private Shape shape;
    private String color;

    public ShapeDecorator(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: " + color);
    }
}
