package com.oops.bookbazaar;

public class BookBazaarTest {
    public static void main(String[] args) {

        EBook ebook1 = new EBook("Java Basics", "Shriyansh", 300, 50, 20); 
        PrintedBook pbook1 = new PrintedBook("Spring boot", "Himesh", 500, 20, 50); 

        System.out.println(ebook1);
        System.out.println(pbook1);

        Order order1 = new Order("John");

        order1.addBook(ebook1, 2);  
        order1.addBook(pbook1, 1);  

        System.out.println("Order Total: ₹" + order1.calculateTotal());
        System.out.println("Order Status: " + order1.getStatus());
    }
}
