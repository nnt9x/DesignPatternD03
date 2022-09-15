package command1;

public class Light implements SmartDevice {
    // Màu sắc
    private String color = "White";

    public Light() {

    }

    public Light(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void lightOn() {
        System.out.printf("Turn on %s light \n", color);
    }

    public void lightOff() {
        System.out.printf("Turn off %s light \n", color);
    }

    @Override
    public void on() {
        lightOn();
    }

    @Override
    public void off() {
        lightOff();
    }
}
