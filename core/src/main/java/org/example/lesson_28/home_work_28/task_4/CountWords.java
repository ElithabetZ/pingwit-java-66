package org.example.lesson_28.home_work_28.task_4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CountWords implements Runnable {

    private String path;
    private Quantity quantity;//не обязательно отдельный класс. 
    //Почитай про AtomicInteger и пакет java.util.concurrent.atomic в целом
    private QuantitySunchronized quantitySunch;

    public CountWords(String path, Quantity quantity, QuantitySunchronized quantitySunch) {
        this.path = path;
        this.quantity = quantity;
        this.quantitySunch = quantitySunch;
    }

    @Override
    public void run() {
        File file = new File(path);
        try {
            List<String> lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
            int count = 0;
            for (String line : lines) {
                String[] quatityLine = line.split(" ");
                count += quatityLine.length;
            }
            quantitySunch.writeContedWords(quantity,count);
        } catch (IOException e) {
            // throw new RuntimeException("Exception while reading file. Details: ", e);
            throw new RuntimeException(e);
        }
    }
}
