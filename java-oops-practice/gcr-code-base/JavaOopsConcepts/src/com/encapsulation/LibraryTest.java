package com.encapsulation;

interface Reservable{
void reserveItem(String borrowerName);
boolean checkAvailability();
}
abstract class LibraryItem{
private int itemId;
private String title;
private String author;
private String borrower;
LibraryItem(int itemId,String title,String author){
this.itemId=itemId;
this.title=title;
this.author=author;
}
public int getItemId(){
return itemId;
}
public String getTitle(){
return title;
}
public String getAuthor(){
return author;
}
protected void setBorrower(String borrower){
this.borrower=borrower;
}
protected String getBorrower(){
return borrower;
}
public void getItemDetails(){
System.out.println(itemId);
System.out.println(title);
System.out.println(author);
}
abstract int getLoanDuration();
}
class Book extends LibraryItem implements Reservable{
Book(int id,String title,String author){
super(id,title,author);
}
int getLoanDuration(){
return 14;
}
public void reserveItem(String borrowerName){
setBorrower(borrowerName);
}
public boolean checkAvailability(){
return getBorrower()==null;
}
}
class Magazine extends LibraryItem implements Reservable{
Magazine(int id,String title,String author){
super(id,title,author);
}
int getLoanDuration(){
return 7;
}
public void reserveItem(String borrowerName){
setBorrower(borrowerName);
}
public boolean checkAvailability(){
return getBorrower()==null;
}
}
class DVD extends LibraryItem implements Reservable{
DVD(int id,String title,String author){
super(id,title,author);
}
int getLoanDuration(){
return 3;
}
public void reserveItem(String borrowerName){
setBorrower(borrowerName);
}
public boolean checkAvailability(){
return getBorrower()==null;
}
}
public class LibraryTest{
static void processItem(LibraryItem item){
item.getItemDetails();
System.out.println(item.getLoanDuration());
}
public static void main(String[] args){
LibraryItem i1=new Book(1,"Java","James");
LibraryItem i2=new Magazine(2,"Tech","Editor");
LibraryItem i3=new DVD(3,"AI","Director");
LibraryItem[] items={i1,i2,i3};
for(LibraryItem item:items){
processItem(item);
}
}
}
