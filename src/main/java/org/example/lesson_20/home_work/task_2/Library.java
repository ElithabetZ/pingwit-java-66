package org.example.lesson_20.home_work.task_2;

import java.time.LocalDate;
import java.util.*;//импорт со * - очень плохая практика. Проверяй, чтобы классы были написаны явно

public class Library {

    private List<Book> books;
    private Set<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
        book.setAdded(true);
    }

    public void removeBook(Book book) {
        //LocalDate.of(0, 1, 1) - это константа в классе Book
        //но мне эта логика не нравится. Лучше сделать так:
        //в методе addBook делать setExpiration(LocalDate.now() + какой-то период (месяц, два и тп), который будет константой
        //а тут ты уже будешь проверять, что если текущая дата после expiration, то надо бы книжечку вернуть)
        if (book.getExpiration().equals(LocalDate.of(0, 1, 1))) {
            books.remove(book);
            book.setAdded(false);
        } else {
            System.out.println("This book is currently being read");
        }
    }

    public void addReader(Reader reader) {
        readers.add(reader);
        reader.setAdded(true);//а зачем ридеру это поле?? Можно просто проверить, есть ли он в коллекции
    }

    public void removeReader(Reader reader) {
        //когда удаляешь читателя, то надо чтобы он все книги вернул в библиотеку
        if (reader.allBooks().size() == 0) {
            readers.remove(reader);
            reader.setAdded(false);
        } else {
            System.out.println(reader.getName() + " " + reader.getSurname() + " must return all books");
        }
    }

    public void getBooks() {
        System.out.println("Our Books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getReaders() {
        System.out.println("Our readers: ");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }

    public Book getBook(Integer index) {
        return books.get(index);
    }

    @Override
    public String toString() {
        return "Library books" + "\n" +
                books + "\n" +
                " Our readers " + "\n" + readers;
    }
}
