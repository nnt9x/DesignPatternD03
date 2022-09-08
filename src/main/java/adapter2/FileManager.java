package adapter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager implements FileHelper {

    private File file = null;

    @Override
    public void open(String path) throws IOException {
        file = new File(path);
        // Nếu file đó không tồn tại thì tạo file đó
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override
    public String read() throws FileNotFoundException {
        StringBuffer contentFile = new StringBuffer();
        if (file != null) {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                contentFile.append(myReader.nextLine());
                contentFile.append("\n");
            }
            myReader.close();
        }
        return contentFile.toString();
    }

    @Override
    public void write(String content) throws IOException {
        FileWriter myWriter = new FileWriter(file, true);
        myWriter.write(content);
        myWriter.close();
    }

    @Override
    public void reset() throws IOException {
        FileWriter myWriter = new FileWriter(file);
        myWriter.write("");
        myWriter.close();
    }
}
