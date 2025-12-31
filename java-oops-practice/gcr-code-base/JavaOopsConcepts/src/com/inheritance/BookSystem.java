package com.inheritance;

class Book{
	String title;
	int publicationYear;
	Book(String title,int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
	public void displayInfo(){
		System.out.println("Book Title: "+title);
		System.out.println("Publication Year: "+publicationYear);
	}
}

class Author extends Book{
	String name;
	String bio;
	Author(String title,int publicationYear,String name,String bio){
		super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Author Name: "+name);
		System.out.println("Author Bio: "+bio);
	}
}

public class BookSystem{
	public static void main(String[] args){
		Author book=new Author("Clean Code",2008,"Robert C. Martin","Software engineer and author known for clean coding practices");
		book.displayInfo();
	}
}
