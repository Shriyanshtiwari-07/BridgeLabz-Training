package com.bookShelf;

public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "George Orwell", "Dystopian");
        Book b2 = new Book("Brave New World", "Aldous Huxley", "Dystopian");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);

        // Duplicate test
        shelf.addBook(b1);

        shelf.displayCatalog();

        // Borrow (remove) a book
        shelf.removeBook(b2);

        shelf.displayCatalog();
    }
}
