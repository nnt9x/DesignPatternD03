package singleton;

public class ChuTich {
    private String hoten;

    private static ChuTich instance = null;

    // Tại sao lại để private???
    // Khoá ko cho khởi tạo đối tượng từ bên ngoài class
    private ChuTich(){}

    public static ChuTich getInstance(){
        if(instance == null){
            instance = new ChuTich();
        }
        return instance;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void dieuHanh(){
        System.out.println("Quyền điều hành lớn nhất");
    }
}
