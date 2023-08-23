package org.example.lesson_26.point_2;

import com.google.gson.Gson;
import netscape.javascript.JSObject;
import org.example.lesson_26.point_1.Student;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class GsonParserExample {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        String json = "{\n"
                +" \"id\": 2,\n";
        JSObject jsonObject =  new JSObject(json);
        System.out.println(jsonObject);
        int id = jsonObject.getInt("id");
        System.out.println(id);
         */

        JSONObject jsonFromPut = new JSONObject();
        jsonFromPut.put("name", "John");
        jsonFromPut.put("age", 23);
        jsonFromPut.put("city", "Chicago");
        System.out.println(jsonFromPut);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 23);
        map.put("city", "Chicago");
        System.out.println(map);


        //read
        Gson gson = new Gson();
        FileReader fileReader = new FileReader("");
        Student student = gson.fromJson(fileReader, Student.class);
        System.out.println(student);
    }
}
