package org.example.lesson_28.home_work_28.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Есть коллекция студентов. У каждого студента есть список любимых книг (книга - это отдельный класс с полями "название" и "год".
Написать программу которая бы выводила на экран топ-3 самых популярных книг среди студентов
 */
public class Main {

    public static void main(String[] args) {
        Uniwersity uniwersity = new Uniwersity();//university

        Book gatsby = new Book("The Great Gatsby", 1925);
        Book mockingbird = new Book("To Kill a Mockingbird", 1960);
        Book shining = new Book("The Shining", 1977);
        Book littlePrince = new Book("The Little Prince", 1943);
        Book fellowship = new Book("The Fellowship of the Ring", 1954);

        Student mike = new Student("Mike", Arrays.asList(gatsby, shining, fellowship));
        Student kate = new Student("Kate", Arrays.asList(mockingbird, littlePrince, gatsby));
        Student luiza = new Student("Luiza", Arrays.asList(gatsby, shining, littlePrince));
        Student jake = new Student("Jake", Arrays.asList(fellowship, shining, mockingbird));
        Student andrew = new Student("Jake", Arrays.asList(gatsby, shining, mockingbird));

        uniwersity.setStudents(Arrays.asList(mike, kate, luiza, jake, andrew));
        topThreeBooks(uniwersity);

    }

    //этот метод должен вовзвращать эти книги. А затем уже в отдельном методе печатать
    //у твоего метода слишком много обязанностей
    //Three - абстрактно. Надо чтобы это был параметр в методе. А потом захочешь поддерживать функциональность
    //топ 1, топ 2 и т.д. И придется новый метод писать?)
    public static void topThreeBooks(Uniwersity uniwersity){
        List<Book> books = new ArrayList<>();
        //Отдельный метод. Это точно не должен делать topThreeBooks (getTopBooks)
        for (Student student: uniwersity.getStudents()) {
            for (Book book: student.bookList()) {
                if(books.isEmpty()){
                    books.add(book);
                    book.setCurrentRating(book.getCurrentRating()+1);
                } else {
                    if(books.contains(book)){
                        book.setCurrentRating(book.getCurrentRating()+1);
                    } else {
                        books.add(book);
                        book.setCurrentRating(book.getCurrentRating()+1);
                    }
                }
            }
        }
        List<Book> sortedList = books.stream()
                .sorted(Comparator.comparing(Book::getCurrentRating).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top three books in this uniwersity:");
        sortedList.forEach(System.out::println);
    }
}
