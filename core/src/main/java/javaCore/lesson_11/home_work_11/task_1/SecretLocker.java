package javaCore.lesson_11.home_work_11.task_1;

/*
Создайте класс SecretLocker. Добавьте в класс поле:
private final String passcode;

Добавьте метод, который будет возвращать значение passcode.
Создайте экземпляр класса SecretLocker. При помощи рефлексии поменяйте passcode у созданного объекта.
Выведите на экран объект класса SecretLocker до и после замены passcode.
 */
public class SecretLocker {

    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    public String getPassCode() {
        return passcode;
    }
    @Override
    public String toString() {
        return "SecretLocker{" +
                "passcode='" + passcode + '\'' +
                '}';
    }
}
