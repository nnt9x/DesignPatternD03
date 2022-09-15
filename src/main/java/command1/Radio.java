package command1;

public class Radio implements SmartDevice {
    private int channel = 1;

    public Radio(){}
    public Radio(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void turnOn() {
        System.out.printf("Radio on %d \n", channel);
    }

    public void turnOff() {
        System.out.println("Radio off");
    }

    @Override
    public void on() {
        turnOn();
    }

    @Override
    public void off() {
        turnOff();
    }
}
