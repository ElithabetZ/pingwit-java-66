package javaCore.lesson_11.home_work_11.task_1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SecretLocker secretLocker = new SecretLocker("Ndneoefle");
        System.out.println(secretLocker);

        Class<SecretLocker> secretLockerClassClass = SecretLocker.class;
        Field field = secretLockerClassClass.getDeclaredField("passcode");
        field.setAccessible(true);
        field.set(secretLocker, "akfoefneknfo");
        System.out.println(secretLocker);
    }
}
