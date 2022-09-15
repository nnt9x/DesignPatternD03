package command1;

public class OffCommand implements Command {

    SmartDevice smartDevice;

    public OffCommand(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    @Override
    public void execute() {
        smartDevice.off();
    }
}
