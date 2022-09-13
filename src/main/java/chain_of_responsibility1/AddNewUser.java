package chain_of_responsibility1;

public class AddNewUser extends BaseHandler {
    @Override
    public void handle(Object obj) {
        UserManager.getInstance().addUser((User) obj);
        System.out.println("Thêm thành công");
        super.handle(obj);
    }
}
