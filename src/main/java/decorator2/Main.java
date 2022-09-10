package decorator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập nội dung email: ");
        String msg = in.nextLine();

        // Nhập thêm cho phép gửi đến facebook hay ko?
        System.out.println("Cho phép gửi thông báo đến facebook?");
        String enableFacebook = in.nextLine();
        in.close();
        // Gửi thông báo đến mail
        Notifier notifier;
        if (enableFacebook.equals("y")) {
            notifier = new FacebookDecorator(new EmailNotifier());
        } else {
            notifier = new EmailNotifier();
        }
        notifier.send(msg);
    }
}
