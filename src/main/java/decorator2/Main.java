package decorator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập nội dung email: ");
        String msg = in.nextLine();

        // Có gửi tiếp đến Slack hay ko?
        System.out.println("Cho phép gửi thông báo đến Slack?");
        String enableSlack = in.nextLine();
        if (enableSlack.equals("y")) {
            notifier = new SlackDecorator(notifier);
        }

        // Nhập thêm cho phép gửi đến facebook hay ko?
        System.out.println("Cho phép gửi thông báo đến facebook?");
        String enableFacebook = in.nextLine();

        // Gửi thông báo đến FB
        if (enableFacebook.equals("y")) {
            notifier = new FacebookDecorator(notifier);
        }
        // Có gửi tiếp thông báo đến SMS hay ko?
        System.out.println("Cho phép gửi thông báo đến SMS?");
        String enableSMS = in.nextLine();
        if (enableSMS.equals("y")) {
            notifier = new SMSDecorator(notifier);
        }

        in.close();
        notifier.send(msg);
    }
}
