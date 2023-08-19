package org.example.lesson_25.point_2;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ApachFileUtilsExample {

    private static final String FILE_PATH = "src/main/java/org/example/lesson_25/point_2/text_25.txt";
    private static final String FILE_PATH_TO_CREATE = "src/main/java/org/example/lesson_25/point_2/create_25.txt";
    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        lines.forEach(System.out::println);

        File fileToCreate = new File(FILE_PATH_TO_CREATE);


    }
}
