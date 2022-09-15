package command1;

public class Client {
    public static void main(String[] args) {
        // Tạo 2 đối tượng bóng đèn, 1 xanh, 1 đỏ
        Light blueLight = new Light("blue");
        Light redLight = new Light("red");
        // Tạo 1 đôí tượng radio
        Radio radio = new Radio();
        // Tạo 1 remote chung để đièu khiển các thiết bị device:
        // Giả sử có 2 nút: on, off.

        // Mở đèn xanh
        Remote remote = new Remote();
        remote.setCommand(new OnCommand(blueLight));
        remote.runCommand();

        // Mở radio
        remote.setCommand(new OnCommand(radio));
        remote.runCommand();

        // Tắt
        remote.setCommand(new OffCommand(blueLight));
        remote.runCommand();
    }
}
