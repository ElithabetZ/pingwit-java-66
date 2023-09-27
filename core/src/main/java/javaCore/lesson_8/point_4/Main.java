package javaCore.lesson_8.point_4;

public class Main {
    public static void main(String[] args) {
        ImmutableDate immutableDate = new ImmutableDate(123, new String[] {"lalalala", "kmdlekfml"});
        String[] secretQuestions = immutableDate.getSecretQuestionsAnswers();
        secretQuestions[0] = "Illy";
        System.out.println(immutableDate);
    }
}
