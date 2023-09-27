package javaCore.lesson_28.home_work_28.task_3;

import java.util.Objects;

public class Book {

    private String name;
    private int year;
    private int currentRating;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
        this.currentRating = 0;
    }

    public int getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(int currentRating) {
        this.currentRating = currentRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", currentRating=" + currentRating +
                '}';
    }
}
