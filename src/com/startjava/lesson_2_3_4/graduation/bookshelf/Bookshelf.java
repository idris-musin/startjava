package com.startjava.lesson_2_3_4.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final static int BOOKS_QUANTITY = 3;
    private final Book[] books = new Book[BOOKS_QUANTITY];
    private int countBook;
    private int infoLength;

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBook);
    }

    public int getCountBook() {
        return countBook;
    }

    public int getInfoLength() {
        return infoLength;
    }

    public int getCountEmptyBookshelf() {
        return BOOKS_QUANTITY - countBook;
    }

    public void add(Book book) {
        books[countBook] = book;
        calculateMaxLength(book);
        countBook++;
    }

    public boolean isFull() {
        return countBook == BOOKS_QUANTITY;
    }

    public Book find(String title) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        int index = findIndex(title);
        if (index < 0) {
            throw new IllegalStateException("Книга не найдена!");
        }
        countBook--;
        System.arraycopy(books, index + 1, books, index, countBook - index);
    }

    public void clear() {
        System.arraycopy(books, 0, books, 0, 0);
        countBook = 0;
    }

    private void calculateMaxLength(Book book) {
        int length = book.toString().length();
        if (length > infoLength) {
            infoLength = length;
        }
    }

    private int findIndex(String title) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
}