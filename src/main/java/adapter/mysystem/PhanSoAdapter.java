package adapter.mysystem;

import adapter.lib.PhanSo;

public class PhanSoAdapter implements Calculator<PhanSo> {
    @Override
    public PhanSo plus(PhanSo... arr) {
        PhanSo tongPhanSo = new PhanSo();
        for (PhanSo ps : arr) {
            tongPhanSo = tongPhanSo.congPhanSo(ps);
        }
        return tongPhanSo;
    }

    @Override
    public PhanSo min(PhanSo... arr) {
        return null;
    }

    @Override
    public PhanSo mul(PhanSo... arr) {
        return null;
    }

    @Override
    public PhanSo div(PhanSo... arr) {
        return null;
    }
}
