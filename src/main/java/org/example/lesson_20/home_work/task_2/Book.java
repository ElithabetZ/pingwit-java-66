package org.example.lesson_20.home_work.task_2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Book<T> {

    private T id;
    private String title;
    private String author;
    private LocalDate expiration;
    private boolean isAdded;//used, isUsed

    public Book(T id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.expiration = LocalDate.of(0,1,1);//такие вещи в константы
    }

    public void setAdded(boolean added) {
        isAdded = added;
    }

    public boolean isAdded() {
        return isAdded;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book<?> book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book:  " +
                "id=" + id +
                ", title= " + title +
                ", author= " + author +
                ", expiration= " + expiration +"\n";
    }
}
