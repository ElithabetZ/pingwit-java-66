package org.example.lesson_21.point_1;

public record Book(String name, String author, int year) implements Comparable<Book>{

    public int compareTo(Book book){
        int nameResult = this.name.compareTo(book.name);

        if(nameResult!=0){
            return nameResult;
        }

        int authorResult = this.author.compareTo(book.author);

        if(authorResult!=0){
            return authorResult;
        }

        return this.year - book.year;

    }
}
