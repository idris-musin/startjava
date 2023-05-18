package com.startjava.lesson_2_3_4.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}