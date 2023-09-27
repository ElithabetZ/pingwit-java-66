package javaCore.lesson_27.point_4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javaCore.lesson_27.point_1.EmployeeXml;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonParserExample {

    public static final String FILE_PASS = "lesson_27/employee.xml";
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        InputStream resorce = ClassLoader.getSystemResourceAsStream(FILE_PASS);
        List<EmployeeXml> employees = xmlMapper.readValue(resorce, new TypeReference<>() {});
        employees.forEach(System.out::println);
    }
}
