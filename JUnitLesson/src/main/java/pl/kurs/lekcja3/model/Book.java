package pl.kurs.lekcja3.model;

import java.time.LocalDate;

public class Book {

    private String name;
    private LocalDate dateOfPublication;
    private double price;
    private String categioory;
    private Author author;

    public Book(String name, LocalDate dateOfPublication, double price, String categioory) {
        this.name = name;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.categioory = categioory;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public String getCategioory() {
        return categioory;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
