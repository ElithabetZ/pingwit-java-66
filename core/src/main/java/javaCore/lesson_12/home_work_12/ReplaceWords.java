package javaCore.lesson_12.home_work_12;
/*
Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
 */
public class ReplaceWords {
    public static void main(String[] args) {
        String str = "Green. red. blue. yellow";
        str = str.replace('.', ',');
        System.out.println(str);
    }
}
