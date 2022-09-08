package adapter2.docx;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestDocx {
    public static void main(String[] args) {
        // Thử nghiệm thư viện, hiểu nó có những phương thức gì

        String fileName = "C:\\java\\hello.docx";

        try (XWPFDocument doc = new XWPFDocument()) {

            // create a paragraph
            XWPFParagraph p1 = doc.createParagraph();
            p1.setAlignment(ParagraphAlignment.CENTER);

            // set font
            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setItalic(true);
            r1.setFontSize(22);
            r1.setFontFamily("New Roman");
            r1.setText("I am first paragraph.");

            // save it to .docx file
            try (FileOutputStream out = new FileOutputStream(fileName)) {
                doc.write(out);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
