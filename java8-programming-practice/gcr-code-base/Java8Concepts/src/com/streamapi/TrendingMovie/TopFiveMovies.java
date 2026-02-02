package com.streamapi.TrendingMovie;

import java.util.*;
public class TopFiveMovies {
	public static void main(String[] args) {
		
		List<Movie> movies = List.of(new Movie("Avengers-age of ultron", 9.8,2018),
									new Movie("One piece", 8.9, 2020),
									new Movie("Alladin",9.0,2022),
									new Movie("Karan-Arjun",9.4,1990),
									new Movie("Shahanshah",8.7,2008),
									new Movie("Bagwan",8.4,2014));
		
		movies.stream().sorted(
				Comparator.comparingDouble((Movie m) -> m.getRating()).reversed()
				.thenComparingInt((Movie m)->m.getReleaseYear()).reversed()).limit(5).forEach(System.out::println);
	}
}
