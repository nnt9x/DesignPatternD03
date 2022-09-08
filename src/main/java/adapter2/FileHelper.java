package adapter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileHelper {

    public void open(String path) throws IOException;

    public String read() throws FileNotFoundException;

    public void write(String content) throws IOException;

    public void reset() throws IOException;
}
