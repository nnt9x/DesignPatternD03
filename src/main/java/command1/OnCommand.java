package command1;

public class OnCommand implements Command {

    SmartDevice smartDevice;

    public OnCommand(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    @Override
    public void execute() {
        smartDevice.on();
    }
}
