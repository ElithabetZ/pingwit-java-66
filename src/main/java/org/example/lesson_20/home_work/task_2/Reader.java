package org.example.lesson_20.home_work.task_2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Reader<T> {

    private T id;
    private String name;
    private String surname;

    private Set<Book> books;

    private boolean isAdded;//думаю, что это лишнее

    public Reader(T id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.books = new HashSet<>();
    }

    public void setAdded(boolean added) {
        isAdded = added;
    }

    public void addBook(Book book) {
        if (isAdded) {
            if (book.isAdded()) {
                //LocalDate.of(0,1,1) -  константа... Представь, что в книге это поменяется. Или в библиотеке, то весь твой код перестанет работать...
                //и зачем это надо?
                if (book.getExpiration().equals(LocalDate.of(0,1,1))) {
                    books.add(book);
                    LocalDate expiration = LocalDate.now().plusDays(30);
                    book.setExpiration(expiration);
                } else {
                    System.out.println("This book is unavailable now");
                }
            } else {
                System.out.println("There are no such book in the library");//There is no such book
            }
        } else {
            System.out.println("You must get a library membership at first!");
        }
    }

    public void removeBook(Book book) {
        if (isAdded) {
            if (books.contains(book)) {
                books.remove(book);
                book.setExpiration(LocalDate.of(0, 1, 1));//no comments, same
            } else {
                System.out.println("You haven't got this book");
            }
        } else {
            System.out.println("You must get a library membership at first!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getBooks() {
        System.out.println(name+" has: ");
        for (Book book : books) {
            System.out.print(book);
        }
    }

    public Set<Book> allBooks(){
        return books;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader<?> reader)) return false;
        return Objects.equals(id, reader.id) && Objects.equals(name, reader.name) && Objects.equals(surname, reader.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name=" + name +
                        ", surname=" + surname + "\n";
    }
}
