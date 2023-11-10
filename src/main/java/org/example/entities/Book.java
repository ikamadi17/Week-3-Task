package org.example.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book extends Person{
    private String title;
    private int quantity;
    private String author;

//    public Book(String science, int i) {
//    }

    public Book(String title, int quantity, String author) {
        this.title = title;
        this.quantity = quantity;
        this.author = author;
    }
//    List<Book> books = new ArrayList<>();{
//books.add(new Book("Forex Psychology", 5, "Unknown Author"));
//books.add(new Book("Geometry", 5, "Unknown Author"));
//books.add(new Book("Data Science", 5, "Unknown Author"));
//books.add(new Book("Agile", 5, "Unknown Author"));
//books.add(new Book("Quality Assurance", 5, "Unknown Author"));

}
