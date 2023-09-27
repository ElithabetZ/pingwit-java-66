package javaCore.lesson_26.home_work_26;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Есть студенты. Каждый студент записан в отдельном .json файле.
У каждого студента есть номер группы, имя, фамилия и список любимых предметов для изучения.
Прочитать студентов при помощи Jackson JSON парсера.

Затем необходимо отсортировать студентов по фамилии и имени и записать отсортированный список в файл
 */

//+++
public class Main {

    private static final String FILE_PATH_Jack = "json/json_les_26/studentJack.json";
    private static final String FILE_PATH_John = "json/json_les_26/studentJohn.json";
    private static final String FILE_PATH_Anna = "json/json_les_26/studentAnna.json";
    private static final String FILE_PATH_IN = "core/src/main/java/org/example/lesson_26/home_work_26/sortedGroup.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Student jack = readStudent(objectMapper, FILE_PATH_Jack);
        Student john = readStudent(objectMapper, FILE_PATH_John);
        Student anna = readStudent(objectMapper, FILE_PATH_Anna);
        List<Student> group = Arrays.asList(jack, john, anna);

        List<Student> sortedGroup = sortGroup(group);

        File file = new File(FILE_PATH_IN);
        objectMapper.writeValue(file, sortedGroup);
    }

    public static Student readStudent(ObjectMapper objectMapper, String path) throws IOException {
        InputStream resource = ClassLoader.getSystemResourceAsStream(path);
        Student student = objectMapper.readValue(resource, Student.class);
        return student;
    }

    public static List<Student> sortGroup(List<Student> group) {
        List<Student> sortedGroup = group.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(Collectors.toList());
        return sortedGroup;
    }
}
