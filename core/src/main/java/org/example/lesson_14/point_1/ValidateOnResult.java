package org.example.lesson_14.point_1;

public class ValidateOnResult {

    private boolean isValue;
    private String message;

    public ValidateOnResult(boolean isValue, String message) {
        this.isValue = isValue;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidateOnResult{" +
                "isValue=" + isValue +
                ", message='" + message + '\'' +
                '}';
    }
}
