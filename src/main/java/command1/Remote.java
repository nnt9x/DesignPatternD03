package command1;

public class Remote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
