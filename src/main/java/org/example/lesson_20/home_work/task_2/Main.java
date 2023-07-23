package org.example.lesson_20.home_work.task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Book<Integer> book1 = new Book<>(1,"In Search of Lost Time", "Marcel Proust");
        Book<Integer> book2 = new Book<>(2,"Ulysses", "James Joyce");
        Book<Integer> book3 = new Book<>(3,"The Great Gatsby", "F. Scott Fitzgerald");
        Book<Integer> book4 = new Book<>(4,"The Odyssey", "Homer");
        Book<String> book5 = new Book<>("01", "Lolita", "Vladimir Nabokov");
        Book<String> book6 = new Book<>("02", "Lolita", "Vladimir Nabokov");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library);


        Reader<Integer> mike = new Reader<>(1, "Mike", "Kamelon");
        library.addReader(mike);
        mike.addBook(book1);
        mike.addBook(book2);
        mike.getBooks();
        mike.addBook(book3);
        mike.getBooks();
        System.out.println("-----------------");
        System.out.println(library);
        mike.removeBook(book2);
        mike.getBooks();
        System.out.println("------------------");
        System.out.println(library);


        Reader<Integer> kate = new Reader<>(2, "Kate", "Kannon");
        library.addReader(kate);
        kate.addBook(book1);
        kate.addBook(book2);
        kate.getBooks();

        Reader<Integer> nisy = new Reader<>(3, "Nisy", "Kannon");
        library.addReader(nisy);
        library.removeReader(kate);
        library.removeReader(nisy);

        library.removeBook(book2);
    }
}
