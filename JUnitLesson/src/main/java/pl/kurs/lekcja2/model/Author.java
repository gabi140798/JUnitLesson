package pl.kurs.lekcja2.model;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private String surname;
    private int age;
    private List<Book> books = new ArrayList<>();

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public void addBook(Book book) {
        if(book.getAuthor() == null) {
            throw new IllegalArgumentException("Ksiazka ma juz autora");
        }
        book.setAuthor(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

}
