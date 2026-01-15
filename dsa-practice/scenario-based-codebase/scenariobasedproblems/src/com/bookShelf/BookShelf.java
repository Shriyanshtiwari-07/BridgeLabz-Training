package com.bookShelf;

import java.util.*;

class BookShelf {

    private Map<String, LinkedList<Book>> catalog;
    private Set<Book> bookSet; // avoids duplication

    public BookShelf() {
        catalog = new HashMap<>();
        bookSet = new HashSet<>();
    }

    // Add a book
    public void addBook(Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not added: " + book);
            return;
        }

        catalog.putIfAbsent(book.getGenre(), new LinkedList<>());
        catalog.get(book.getGenre()).add(book);
        bookSet.add(book);

        System.out.println("Book added: " + book);
    }

    // Remove a book
    public void removeBook(Book book) {
        if (!bookSet.contains(book)) {
            System.out.println("Book not found: " + book);
            return;
        }

        LinkedList<Book> books = catalog.get(book.getGenre());
        books.remove(book);

        if (books.isEmpty()) {
            catalog.remove(book.getGenre());
        }

        bookSet.remove(book);
        System.out.println("Book removed: " + book);
    }

    // Display catalog
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}