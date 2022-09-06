package adapter.mysystem;

import adapter.lib.PhanSo;

import java.lang.reflect.Array;

public class Client {
    public static void main(String[] args) {
        Calculator<Float> floatCalculator = new FloatCalculator();

        float a = floatCalculator.plus(1f, 2.4f, 3.5f, 4.6f);
        System.out.println(a);

        Calculator<PhanSo> phanSoCalculator = new PhanSoAdapter();
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 2);
        PhanSo ps3 = new PhanSo(7, 2);
        System.out.println(phanSoCalculator.plus(ps1, ps2, ps3));

    }
}
