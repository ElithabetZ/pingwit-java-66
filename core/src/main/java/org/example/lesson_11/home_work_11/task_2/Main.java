package org.example.lesson_11.home_work_11.task_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SecretClass secretClass = new SecretClass();
        Class<SecretClass> secretClassClass = SecretClass.class;
        Method method = secretClassClass.getDeclaredMethod("print");
        method.setAccessible(true);
        method.invoke(secretClass);
    }
}
