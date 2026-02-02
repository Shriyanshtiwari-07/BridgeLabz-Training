package com.collectors.librarybookstatistics;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {
	public static void main(String[] args) {
		List<Book> books = List.of(
			    new Book("The Alchemist", "Fiction", 300),
			    new Book("Harry Potter", "Fiction", 250),
			    new Book("Brief History of Time", "Science", 400),
			    new Book("Cosmos", "Science", 350),
			    new Book("Sapiens", "History", 500)
			);
		Map<String, IntSummaryStatistics> statsByGenre =
		        books.stream()
		             .collect(Collectors.groupingBy(
		                     Book::getGenre,
		                     Collectors.summarizingInt(Book::getPage)
		             ));
		statsByGenre.forEach((genre, stats) -> {
		    System.out.println("Genre: " + genre);
		    System.out.println("Total Pages: " + stats.getSum());
		    System.out.println("Average Pages: " + stats.getAverage());
		    System.out.println("Maximum Pages: " + stats.getMax());
		    System.out.println();
		});

	}
}
