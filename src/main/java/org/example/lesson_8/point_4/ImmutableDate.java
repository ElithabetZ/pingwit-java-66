package org.example.lesson_8.point_4;

import java.util.Arrays;

public class ImmutableDate {

    private int pin;
    private String[] secretQuestionsAnswers;

    public ImmutableDate(int pin, String[] secretQuestionsAnswers) {
        this.pin = pin;
        this.secretQuestionsAnswers = secretQuestionsAnswers;
    }

    public String[] getSecretQuestionsAnswers() {
        return secretQuestionsAnswers.clone();
    }

    @Override
    public String toString() {
        return "ImmutableDate{" +
                "pin=" + pin +
                ", secretQuestionsAnswers=" + Arrays.toString(secretQuestionsAnswers) +
                '}';
    }
}
