package javaCore.lesson_17.home_work_17.task_1;

import java.io.*;

public class OOS {

    private static final String PATH = "src/main/java/org/example/lesson_17/home_work_17/task_1/employee";

    public static void main(String[] args) {
        write(PATH);
        read(PATH);
    }

    public static void write(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            Employee employee = new Employee("Mike", 25, new Work("Office", 3));
            oos.writeObject(employee);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
