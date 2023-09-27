package javaCore.lesson_28.home_work_28.task_1;

/*
Создать класс, который в цикле выводит на экран числа от 0-20 и в каждой итерации цикла засыпает на 1 секунду,
запустить его в отдельном потоке. Поток main должен дождаться окончания работы дочернего потока
и затем вывести на экран сообщение о том, что главный поток завершен
 */
//+
public class Main {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread threadRunnable = new Thread(runnableClass);
        threadRunnable.start();

        try {
            threadRunnable.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Runnable is over");
    }
}
