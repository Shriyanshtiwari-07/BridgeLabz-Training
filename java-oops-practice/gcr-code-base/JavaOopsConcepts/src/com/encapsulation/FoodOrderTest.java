package com.encapsulation;

interface Discountable{
double applyDiscount();
String getDiscountDetails();
}
abstract class FoodItem{
private String itemName;
private double price;
private int quantity;
FoodItem(String itemName,double price,int quantity){
this.itemName=itemName;
this.price=price;
this.quantity=quantity;
}
public String getItemName(){
return itemName;
}
public double getPrice(){
return price;
}
public int getQuantity(){
return quantity;
}
public void getItemDetails(){
System.out.println(itemName);
System.out.println(price);
System.out.println(quantity);
}
abstract double calculateTotalPrice();
}
class VegItem extends FoodItem implements Discountable{
VegItem(String name,double price,int qty){
super(name,price,qty);
}
double calculateTotalPrice(){
return getPrice()*getQuantity();
}
public double applyDiscount(){
return calculateTotalPrice()*0.10;
}
public String getDiscountDetails(){
return "10% Veg Discount";
}
}
class NonVegItem extends FoodItem implements Discountable{
NonVegItem(String name,double price,int qty){
super(name,price,qty);
}
double calculateTotalPrice(){
return (getPrice()*getQuantity())+50;
}
public double applyDiscount(){
return calculateTotalPrice()*0.05;
}
public String getDiscountDetails(){
return "5% Non-Veg Discount";
}
}
public class FoodOrderTest{
static void processOrder(FoodItem item){
double discount=0;
if(item instanceof Discountable){
discount=((Discountable)item).applyDiscount();
}
double finalAmount=item.calculateTotalPrice()-discount;
item.getItemDetails();
System.out.println(finalAmount);
}
public static void main(String[] args){
FoodItem f1=new VegItem("Paneer",200,2);
FoodItem f2=new NonVegItem("Chicken",300,1);
FoodItem[] order={f1,f2};
for(FoodItem item:order){
processOrder(item);
}
}
}
