package chain_of_responsibility1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("user123456","12334455555");
        User user2 = new User("user123456","12334455553");
        Handler handler1 = new ValidateData();
        Handler handler2 = new CheckExitsUser();
        Handler handler3 = new AddNewUser();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        // Thêm user1
        handler1.handle(user1);

        // Thêm user2
        handler1.handle(user2);


    }
}
