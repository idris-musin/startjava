package com.startjava.lesson_2_3_4.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private final static int ADD_BOOK = 1;
    private final static int FIND_BOOK = 2;
    private final static int DELETE_BOOK = 3;
    private final static int CLEAR_BOOKSHELF = 4;
    private final static int EXIT_BOOKSHELF = 5;

    private static final Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            bookshelfInfo();
            System.out.print("""
                    \nМеню:
                        1. Добавить книгу
                        2. Найти книгу
                        3. Удалить книгу
                        4. Очистить книжную полку
                        5. Завершить программу
                    """);
            System.out.print("\nВыберите пункт меню: ");
            try {
                executeUserChoice(Integer.parseInt(scanner.next()));
            } catch (NumberFormatException | IllegalStateException e) {
                System.out.println("Введите правильный пункт меню!");
            }
            pressEnter();
        }
    }

    private static void bookshelfInfo() {
        if (bookshelf.getCountBook() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу " + bookshelf.getCountBook() +
                    " книги и свободно " + bookshelf.getCountEmptyBookshelf() + " полок");
            int countMaxLength = bookshelf.getInfoLength();
            Book[] books = bookshelf.getBooks();
            for (Book book : books) {
                System.out.printf("|%-" + countMaxLength + "s|%n", book);
                System.out.println("|" + "-".repeat(countMaxLength) + "|");
            }
            System.out.println("|" + " ".repeat(countMaxLength) + "|");
        }
    }

    private static void executeUserChoice(int inputItem) {
        switch (inputItem) {
            case ADD_BOOK -> addBook();
            case FIND_BOOK -> findBook();
            case DELETE_BOOK -> deleteBook();
            case CLEAR_BOOKSHELF -> clearBookshelf();
            case EXIT_BOOKSHELF -> exitBookshelf();
            default -> throw new IllegalStateException();
        }
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        if (bookshelf.isFull()) {
            System.out.println("Книжный шкаф полон!");
            return;
        }
        String author;
        String title;
        String publishYear;

        while (true) {
            System.out.print("Автор книги: ");
            author = scanner.nextLine();
            if (!author.isEmpty()) {
                break;
            }
            System.out.println("Вы не ввели автора книги!");
        }

        while (true) {
            System.out.print("Название книги: ");
            title = scanner.nextLine();
            if (!title.isEmpty()) {
                break;
            }
            System.out.println("Вы не ввели название книги!");
        }

        while (true) {
            System.out.print("Год издания книги: ");
            publishYear = scanner.nextLine();
            if (isNumeric(publishYear)) {
                break;
            }
            System.out.println("Введите корректные данные!");
        }
        bookshelf.add(new Book(author, title, Integer.parseInt(publishYear)));
    }

    public static boolean isNumeric(String string) {
        try {
            if (Integer.parseInt(string) > 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    private static void findBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги, которую хотите найти: ");
        Book book = bookshelf.find(scanner.nextLine());
        System.out.println(book != null ? book : "Книга не найдена!");
    }

    private static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название книги, которую хотите удалить: ");
        bookshelf.delete(scanner.nextLine());
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("Книжный шкаф очищен!");
    }

    private static void exitBookshelf() {
        System.exit(0);
    }

    private static void pressEnter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для продолжения работы нажмите Enter");
        scanner.nextLine();
    }
}