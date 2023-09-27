package javaCore.lesson_17.home_work_17.task_3;

import java.io.File;
//Имя класса с большой буквы!
//А так ++
public class namesOfTheCataloge {

    private static final String PATH = "C:/Users/Spedi/Documents/Java/pingwit-java-66";

    public static void main(String[] args) {
        File folder = new File(PATH);
        File[] listOfFiles = folder.listFiles();
        listOfFiles(listOfFiles);
    }

    public static void listOfFiles(File[] listOfFiles) {
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("--------------------------------------------");
                System.out.println("Directory " + listOfFiles[i].getName());
                File[] listOfSubDirectory = listOfFiles[i].listFiles();
                listOfFiles(listOfSubDirectory);
            }
        }
    }

}
