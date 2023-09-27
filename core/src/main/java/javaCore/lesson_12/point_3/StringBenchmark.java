package javaCore.lesson_12.point_3;

public class StringBenchmark {
    public static void main(String[] args) {
        String str1 = "A";
        StringBuilder str2 = new StringBuilder("A");
        StringBuffer str3 = new StringBuffer("A");
        String strToAdd = "B";

        int times = 1_000_000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str1 += strToAdd;
        }
        long str1Finish = System.currentTimeMillis();
        System.out.println("String: " +(str1Finish - start));

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str2.append(strToAdd);
        }
        long str2Finish = System.currentTimeMillis();
        System.out.println("String: " +(str2Finish - start2));

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str3.append(strToAdd);
        }
        long str3Finish = System.currentTimeMillis();
        System.out.println("String: " +(str3Finish - start3));
    }
}
