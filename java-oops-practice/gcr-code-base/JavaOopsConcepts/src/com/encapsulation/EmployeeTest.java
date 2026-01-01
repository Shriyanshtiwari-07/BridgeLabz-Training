package com.encapsulation;

//Interface for department-related behavior
interface Department{
 void assignDepartment(String dept);
 String getDepartmentDetails();
}

//Abstract Employee class
abstract class Employee implements Department{

 // Encapsulated fields
 private int employeeId;
 private String name;
 private double baseSalary;
 private String department;

 // Constructor
 Employee(int employeeId,String name,double baseSalary){
     this.employeeId=employeeId;
     this.name=name;
     this.baseSalary=baseSalary;
 }

 // Getters and setters
 public int getEmployeeId(){
     return employeeId;
 }

 public String getName(){
     return name;
 }

 public double getBaseSalary(){
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary){
     this.baseSalary=baseSalary;
 }

 // Interface method implementations
 public void assignDepartment(String dept){
     this.department=dept;
 }

 public String getDepartmentDetails(){
     return department;
 }

 // Abstract method
 abstract double calculateSalary();

 // Concrete method
 public void displayDetails(){
     System.out.println(employeeId);
     System.out.println(name);
     System.out.println(calculateSalary());
     System.out.println(department);
 }
}

//Full-time employee
class FullTimeEmployee extends Employee{

 FullTimeEmployee(int id,String name,double salary){
     super(id,name,salary);
 }

 double calculateSalary(){
     return getBaseSalary();
 }
}

//Part-time employee
class PartTimeEmployee extends Employee{

 private int hoursWorked;
 private double hourlyRate;

 PartTimeEmployee(int id,String name,int hours,double rate){
     super(id,name,0);
     this.hoursWorked=hours;
     this.hourlyRate=rate;
 }

 double calculateSalary(){
     return hoursWorked*hourlyRate;
 }
}

//Test class
public class EmployeeTest{
 public static void main(String[] args){

     Employee e1=new FullTimeEmployee(1,"Amit",50000);
     Employee e2=new PartTimeEmployee(2,"Riya",80,300);

     e1.assignDepartment("IT");
     e2.assignDepartment("HR");

     Employee[] employees={e1,e2};

     for(Employee e:employees){
         e.displayDetails();
     }
 }
}
