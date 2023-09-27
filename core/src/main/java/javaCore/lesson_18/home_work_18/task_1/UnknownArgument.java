package javaCore.lesson_18.home_work_18.task_1;
/*
Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте в классе метод,
который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())
 */
public class UnknownArgument<T> {

private T arg;

    public UnknownArgument(T arg) {
        this.arg = arg;
    }

    public String getArgType(){
        return arg.getClass().getName();
    }
}
