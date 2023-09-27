package javaCore.lesson_15.home_work_15.task_3;
/*
Создайте метод, который принимает целочисленный параметр и
возвращает логическое значение, указывающее, является ли число
простым или нет. Если параметр меньше или равен нулю, создайте исключение
IllegalArgumentException.
Сделайте Task 1 еще раз, но уже создайте свое исключение и при ошибке передавайте ему сообщение
 */
public class Main {
    public static void main(String[] args) {
        try{
            boolean result = Prime.findPrime(1);
            System.out.println(result);
        }
        catch(ExeptionPrime ex){
//пустые строки!
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
