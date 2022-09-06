package adapter.mysystem;

public class FloatCalculator implements Calculator<Float> {
    @Override
    public Float plus(Float... arr) {
        float t = 0;
        for (float i : arr) {
            t += i;
        }
        return t;
    }

    @Override
    public Float min(Float... arr) {
        float t = arr[0];
        for (int i = 1; i < arr.length; i++) {
            t = t - arr[i];
        }
        return t;
    }

    @Override
    public Float mul(Float... arr) {
        float t = 1;
        for (float i : arr) {
            t *= i;
        }
        return t;
    }

    @Override
    public Float div(Float... arr) {
        float t = arr[0];
        for (int i = 1; i < arr.length; i++) {
            t = t / arr[i];
        }
        return t;
    }
}
