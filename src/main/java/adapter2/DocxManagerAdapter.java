package adapter2;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class DocxManagerAdapter implements FileHelper {
    private XWPFDocument documentService;
    private String myPath;

    @Override
    public void open(String path) throws IOException {
        this.myPath = path;
        // Kiểm tra xem có tồn tại hay ko?
        File f = new File(path);
        if (!f.exists()) {
            throw new RuntimeException("File không tồn tại");
        }
    }

    @Override
    public String read() throws FileNotFoundException {
        String docText;
        try (XWPFDocument doc = new XWPFDocument(
                Files.newInputStream(Paths.get(myPath)))) {

            XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(doc);
            docText = xwpfWordExtractor.getText();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return docText;
    }

    @Override
    public void write(String content) throws IOException {
        documentService = new XWPFDocument();
        XWPFParagraph p1 = documentService.createParagraph();
        XWPFRun r1 = p1.createRun();
        r1.setText(content);
        try (FileOutputStream out = new FileOutputStream(myPath)) {
            documentService.write(out);
        }
    }

    @Override
    public void reset() throws IOException {

    }
}
