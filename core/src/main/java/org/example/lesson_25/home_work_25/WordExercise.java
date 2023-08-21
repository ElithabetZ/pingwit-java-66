
package org.example.lesson_25.home_work_25;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Создание документа MS Word.
Когда запускается программа, пользователя просят ввести название рассказа и текст повествования.

Название рассказа - это будет название файла, например "Что мне нравится в программировании.docx".
Не забудьте указать расширение файла ".docx"

Название рассказа мы также размещаем по центру в начале документа и делаем его большим жирным шрифтом.

Основную часть повествования делаем меньшим шрифтом с выравниванием по левому краю.

В конце сохраните получившийся документ на диск, можете прямо рядом с основными классами этого задания.
 */
public class WordExercise {

    private static final String FILE_PATH = "core/src/main/java/org/example/lesson_25/home_work_25/";

    public static void main(String[] args) {
        XWPFDocument wordFile = new XWPFDocument();
        createFile(wordFile);
    }

    private static void createFile(XWPFDocument file) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type the Title");
        String title = scan.nextLine();
        System.out.println(title);
        createTitle(file, title);

        System.out.println("Please, type the subtitle");
        String subTitle = scan.nextLine();
        System.out.println(subTitle);
        createSubTitle(file, subTitle);

        write(file, title);
    }

    private static void createTitle(XWPFDocument file, String titleName) {
        XWPFParagraph title = file.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun titleRun = title.createRun();
        titleRun.setText(titleName);
        titleRun.setColor("404FC0");
        titleRun.setBold(true);
        titleRun.setFontFamily("Courier");
        titleRun.setFontSize(20);
    }

    private static void createSubTitle(XWPFDocument file, String subTitleName) {
        XWPFParagraph title = file.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun titleRun = title.createRun();
        titleRun.setText(subTitleName);
        titleRun.setColor("3AC65F");
        titleRun.setItalic(true);
        titleRun.setFontFamily("Courier");
        titleRun.setFontSize(16);
    }

    private static void write(XWPFDocument file, String name) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH + name + ".docx")) {
            file.write(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
