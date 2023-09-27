package javaCore.lesson_14.home_work_14.task_1;

public class ValidationResult {

    private boolean isValed;
    private String message;

    public ValidationResult(boolean isValed, String message) {
        this.isValed = isValed;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "isValed=" + isValed +
                ", message='" + message + '\'' +
                '}';
    }
}
