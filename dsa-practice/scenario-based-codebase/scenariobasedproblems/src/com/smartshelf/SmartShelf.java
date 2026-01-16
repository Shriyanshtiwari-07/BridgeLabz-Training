package com.smartshelf;

public class SmartShelf {

    // Insertion Sort by book title (Alphabetical Order)
    public static void insertionSortByTitle(Book[] books, int count) {
        for (int i = 1; i < count; i++) {
            Book key = books[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key; // Insert at correct position
        }
    }

    public static void main(String[] args) {
        Book[] shelf = new Book[10];
        int count = 0;

        // Real-time book additions
        shelf[count++] = new Book("Java Programming", "James Gosling");
        insertionSortByTitle(shelf, count);

        shelf[count++] = new Book("Algorithms", "Robert Sedgewick");
        insertionSortByTitle(shelf, count);

        shelf[count++] = new Book("Data Structures", "Mark Allen Weiss");
        insertionSortByTitle(shelf, count);

        shelf[count++] = new Book("Artificial Intelligence", "Stuart Russell");
        insertionSortByTitle(shelf, count);

        System.out.println("Sorted Reading List:");
        for (int i = 0; i < count; i++) {
            shelf[i].display();
        }
    }
}