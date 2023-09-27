package javaCore.lesson_25.point_3;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class MSWordFileCreationExample {

    private static final String FILE_PATH = "core/src/main/java/org/example/lesson_25/point_3/meWordDocument.docx";
    public static void main(String[] args) {
        XWPFDocument document = new XWPFDocument();
        createTitle(document);
        write(document);
    }

    private static void createTitle(XWPFDocument document){
        XWPFParagraph title = document.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun titleRun = title.createRun();
        titleRun.setText("Creating Word Document");
        titleRun.setColor("009933");
        titleRun.setBold(true);
        titleRun.setFontFamily("Courier");
        titleRun.setFontSize(20);
    }

    private static void write(XWPFDocument document){
        try(FileOutputStream fos = new FileOutputStream(FILE_PATH)){
            document.write(fos);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
