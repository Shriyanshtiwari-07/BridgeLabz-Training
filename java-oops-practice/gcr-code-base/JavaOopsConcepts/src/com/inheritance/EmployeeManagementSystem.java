package com.inheritance;


class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Team Size: "+teamSize);
	}
}

class Developer extends Employee{
	String programmingLanguage;
	Developer(String name,int id,double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage=programmingLanguage;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Programming Language: "+programmingLanguage);
	}
}

class Intern extends Employee{
	int duration;
	Intern(String name,int id,double salary,int duration){
		super(name,id,salary);
		this.duration=duration;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Internship Duration: "+duration+" months");
	}
}

public class EmployeeManagementSystem{
	public static void main(String[] args){
		Employee manager=new Manager("Rahul",101,75000,5);
		Employee developer=new Developer("Amit",102,60000,"Java");
		Employee intern=new Intern("Neha",103,15000,6);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}
}