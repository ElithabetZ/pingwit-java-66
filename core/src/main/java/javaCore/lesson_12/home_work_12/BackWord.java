package javaCore.lesson_12.home_work_12;
/*
Есть слово “alucard”. Нужно изменить порядок букв на обратный.
 */
public class BackWord {
    public static void main(String[] args) {
        String word = "alucard";
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
