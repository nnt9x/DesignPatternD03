package command;

public class DimLightCommand implements Command{

    private Light light;

    public DimLightCommand(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.dimLight();
    }
}
