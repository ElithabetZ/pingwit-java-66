package javaCore.lesson_17.point_4;


import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class MicrosoftWordReadExample {

    public static void main(String[] args) {
        File docs = new File("src/main/java/org/example/lesson_17/point_4/example.docx");
        try(FileInputStream fis = new FileInputStream(docs)){
            XWPFDocument docunemt = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = docunemt.getParagraphs();
            for(XWPFParagraph doc: paragraphs){
                System.out.println(doc.getText());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
