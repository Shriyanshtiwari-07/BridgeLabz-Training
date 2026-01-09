package com.oops.bookbazaar;

import java.util.ArrayList;
import java.util.List;

class Order {
    private String user;
    private List<Book> books = new ArrayList<>();
    private String status; // only accessible internally

    public Order(String user) {
        this.user = user;
        this.status = "Pending";
    }

    public void addBook(Book book, int quantity) {
        if(book.getStock() >= quantity) {
            books.add(book);
            book.updateStock(quantity);
        } else {
            System.out.println("Not enough stock for " + book.getTitle());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for(Book b : books) {
            if(b instanceof Discountable) {
                total += ((Discountable) b).applyDiscount();
            } else {
                total += b.getPrice();
            }
        }
        return total;
    }

    // Access modifier restricts status updates
    protected void updateStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}