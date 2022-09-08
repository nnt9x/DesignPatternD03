package adapter2;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        FileHelper fileManager = new DocxManagerAdapter();
        try {
            fileManager.open("C:\\java\\design_pattern.docx");
            System.out.println(fileManager.read());
            fileManager.write("Xin chao ca lop");
            System.out.println("\n\n");
            System.out.println(fileManager.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
