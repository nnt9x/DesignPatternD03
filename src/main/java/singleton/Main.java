package singleton;

public class Main {
    public static void main(String[] args) {
//        ChuTich ct1 = new ChuTich();
        ChuTich ct1 = ChuTich.getInstance();
        ChuTich ct2 = ChuTich.getInstance();
        System.out.println(ct1.hashCode());
        System.out.println(ct2.hashCode());
    }
}
