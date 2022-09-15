package command;

import java.rmi.Remote;

public class Client {
    public static void main(String[] args) {
        // Tạo ra 1 bóng đèn
        Light light = new Light();

        // Remote
        MyRemote myRemote = new MyRemote();
        // Bật đèn
        myRemote.setCommand(new LightOnCommand(light));
        myRemote.pressButton();
        // Tắt đèn
        myRemote.setCommand(new LightOffCommand(light));
        myRemote.pressButton();

        // Dim light
        myRemote.setCommand(new DimLightCommand(light));
        myRemote.pressButton();


    }
}
