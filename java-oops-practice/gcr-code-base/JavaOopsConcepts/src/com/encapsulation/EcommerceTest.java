package com.encapsulation;

interface Taxable{
double calculateTax();
String getTaxDetails();
}
abstract class Product{
private int productId;
private String name;
private double price;
Product(int productId,String name,double price){
this.productId=productId;
this.name=name;
this.price=price;
}
public int getProductId(){
return productId;
}
public String getName(){
return name;
}
public double getPrice(){
return price;
}
public void setPrice(double price){
this.price=price;
}
abstract double calculateDiscount();
}
class Electronics extends Product implements Taxable{
Electronics(int id,String name,double price){
super(id,name,price);
}
double calculateDiscount(){
return getPrice()*0.10;
}
public double calculateTax(){
return getPrice()*0.18;
}
public String getTaxDetails(){
return "GST 18%";
}
}
class Clothing extends Product implements Taxable{
Clothing(int id,String name,double price){
super(id,name,price);
}
double calculateDiscount(){
return getPrice()*0.20;
}
public double calculateTax(){
return getPrice()*0.05;
}
public String getTaxDetails(){
return "GST 5%";
}
}
class Groceries extends Product{
Groceries(int id,String name,double price){
super(id,name,price);
}
double calculateDiscount(){
return getPrice()*0.05;
}
}
public class EcommerceTest{
static void printFinalPrice(Product p){
double tax=0;
if(p instanceof Taxable){
tax=((Taxable)p).calculateTax();
}
double finalPrice=p.getPrice()+tax-p.calculateDiscount();
System.out.println(p.getName());
System.out.println(finalPrice);
}
public static void main(String[] args){
Product p1=new Electronics(1,"Laptop",60000);
Product p2=new Clothing(2,"Jacket",3000);
Product p3=new Groceries(3,"Rice",1200);
Product[] products={p1,p2,p3};
for(Product p:products){
printFinalPrice(p);
}
}
}
