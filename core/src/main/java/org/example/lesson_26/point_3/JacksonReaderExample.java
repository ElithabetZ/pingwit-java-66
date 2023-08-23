package org.example.lesson_26.point_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.lesson_26.entity.Pingwit;

import java.io.IOException;
import java.io.InputStream;

public class JacksonReaderExample {

    private static final String FILE_PATH="json/json_les_26/pingwit.json";
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        InputStream resourses = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        Pingwit pingwit = objectMapper.readValue(resourses, Pingwit.class);
        System.out.println(pingwit);
    }
}
