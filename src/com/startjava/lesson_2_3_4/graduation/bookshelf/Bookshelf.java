package com.startjava.lesson_2_3_4.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private final static int BOOKS_QUANTITY = 3;
    private final Book[] books = new Book[BOOKS_QUANTITY];
    private int countBooks;
    private int maxLength;

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int receiveCountEmptyShelfs() {
        return BOOKS_QUANTITY - countBooks;
    }

    public void add(Book book) {
        books[countBooks] = book;
        calculateMaxLength(book);
        countBooks++;
    }

    public boolean isFull() {
        return countBooks == BOOKS_QUANTITY;
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        int index = findIndex(title);
        if (index < 0) {
            System.out.println("Книга не найдена!");
            return;
        }
        countBooks--;
        System.arraycopy(books, index + 1, books, index, countBooks - index);
    }

    public void clear() {
        System.arraycopy(books, 0, books, 0, 0);
        countBooks = 0;
    }

    private void calculateMaxLength(Book book) {
        int length = book.toString().length();
        if (length > maxLength) {
            maxLength = length;
        }
    }

    private int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
}