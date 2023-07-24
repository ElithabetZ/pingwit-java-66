package org.example.lesson_20.home_work.task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//хотелось бы консольное приложение...
//и чтобы книги были из файла, например - https://mkyong.com/java/how-to-read-an-object-from-file-in-java/ P.S мы это проходили на 16 занятии
public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        addBooks(library);
        Reader<Integer> mike = new Reader<>(1, "Mike", "Kamelon");
        Reader<Integer> kate = new Reader<>(2, "Kate", "Kannon");
        library.addReader(mike);
        library.addReader(kate);
        System.out.println(library);

        mike.addBook(library.getBook(1));
        mike.addBook(library.getBook(2));
        mike.getBooks();

        library.removeReader(kate);
        library.removeReader(mike);

        library.removeBook(library.getBook(2));
    }

    public static void addBooks(Library library){
        Book<Integer> book1 = new Book<>(1,"In Search of Lost Time", "Marcel Proust");
        Book<Integer> book2 = new Book<>(2,"Ulysses", "James Joyce");
        Book<Integer> book3 = new Book<>(3,"The Great Gatsby", "F. Scott Fitzgerald");
        Book<Integer> book4 = new Book<>(4,"The Odyssey", "Homer");
        Book<String> book5 = new Book<>("01", "Lolita", "Vladimir Nabokov");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }
}
