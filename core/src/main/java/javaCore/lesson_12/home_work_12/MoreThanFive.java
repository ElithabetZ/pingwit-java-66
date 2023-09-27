package javaCore.lesson_12.home_work_12;
/*
Есть массив строк, вывести на экран все строки, длина которых больше 5 символов
 */
public class MoreThanFive {
    public static void main(String[] args) {
        String[] text = {"fmeofkmoer", "fmeronfoer", "cneornvoerivore", "mferkomrel", "mfeo", "mfrk", "mkr"};
        int moreThanNumber = 5;//нейминг не очень. Лучше lengthLimit
        for(int i = 0; i < text.length; i++)//ctrl+alt+l. 10 строка должна быть в 9
        {
            if(text[i].length() > moreThanNumber)//форматирование
            {
                System.out.println(text[i]);
            }
        }
    }
}
