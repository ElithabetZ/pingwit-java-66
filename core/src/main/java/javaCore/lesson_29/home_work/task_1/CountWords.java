package javaCore.lesson_29.home_work.task_1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
//а что,если еще попрактиковать решить задачу через Callable? 1 поток - 1 файл
//а так +
public class CountWords implements Runnable{

    private String path;
    private AtomicInteger quantity = new AtomicInteger();

    public CountWords(String path) {
        this.path = path;
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
            quantity.addAndGet(count);
        } catch (IOException e) {
            throw new RuntimeException("Exception while reading file. Details: ", e);
        }
    }

    public AtomicInteger getQuantity() {
        return quantity;
    }
}
