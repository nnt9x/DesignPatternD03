package adapter.lib;

/*
Luu y phan nay la thu vien ben thu 3, minh mong muon su dung no, làm sao để tương thích
cả với hệ thống cũ
 */
public class PhanSo {
    // thuoc tinh
    private long tuSo = 0;
    private long mauSo = 1;

    // phuong thuc

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Loi, khong the tao phan so nay");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        runGonPhanSo();
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
        runGonPhanSo();
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Mau so phai khac 0");
        }
        this.mauSo = mauSo;
        runGonPhanSo();
    }

    // Phuong thuc tim dc UCLN
    private static long findGCD(long x, long y) {
        //base case
        if (y == 0) {
            return x;
        }
        return findGCD(y, x % y);
    }

    private void runGonPhanSo() {
        long UCLN = findGCD(this.tuSo, this.mauSo);
        this.tuSo = this.tuSo / UCLN;
        this.mauSo = this.mauSo / UCLN;
    }

    public PhanSo congPhanSo(PhanSo phanSo) {
        long tuSoMoi = this.tuSo * phanSo.mauSo + this.mauSo * phanSo.tuSo;
        long mauSoMoi = this.mauSo * phanSo.mauSo;

        PhanSo psMoi = new PhanSo(tuSoMoi, mauSoMoi);
        psMoi.runGonPhanSo();
        // Tim cach rut gon phan so
        return psMoi;
    }

    public PhanSo truPhanSo(PhanSo phanSo) {
        long tuSoMoi = this.tuSo * phanSo.mauSo - this.mauSo * phanSo.tuSo;
        long mauSoMoi = this.mauSo * phanSo.mauSo;

        PhanSo psMoi = new PhanSo(tuSoMoi, mauSoMoi);
        psMoi.runGonPhanSo();
        // Tim cach rut gon phan so
        return psMoi;
    }

    public PhanSo nhanPhanSo(PhanSo phanSo) {
        long tuSoMoi = this.tuSo * phanSo.tuSo;
        long mauSoMoi = this.mauSo * phanSo.mauSo;

        PhanSo psMoi = new PhanSo(tuSoMoi, mauSoMoi);
        psMoi.runGonPhanSo();
        // Tim cach rut gon phan so
        return psMoi;
    }

    public PhanSo chiaPhanSo(PhanSo phanSo) {
        if (phanSo.tuSo == 0) {
            throw new RuntimeException("Khong the thuc hien phep tinh");
        }
        long tuSoMoi = this.tuSo * phanSo.mauSo;
        long mauSoMoi = this.mauSo * phanSo.tuSo;

        PhanSo psMoi = new PhanSo(tuSoMoi, mauSoMoi);
        psMoi.runGonPhanSo();
        // Tim cach rut gon phan so
        return psMoi;
    }

    @Override
    public String toString() {
        return this.tuSo + "/" + this.mauSo;
    }
}
