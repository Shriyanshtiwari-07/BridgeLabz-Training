package com.encapsulation;

interface MedicalRecord{
void addRecord(String record);
String viewRecords();
}
abstract class Patient{
private int patientId;
private String name;
private int age;
private String diagnosis;
Patient(int patientId,String name,int age){
this.patientId=patientId;
this.name=name;
this.age=age;
}
public int getPatientId(){
return patientId;
}
public String getName(){
return name;
}
public int getAge(){
return age;
}
protected void setDiagnosis(String diagnosis){
this.diagnosis=diagnosis;
}
protected String getDiagnosis(){
return diagnosis;
}
public void getPatientDetails(){
System.out.println(patientId);
System.out.println(name);
System.out.println(age);
}
abstract double calculateBill();
}
class InPatient extends Patient implements MedicalRecord{
private int daysAdmitted;
private double dailyCharge;
InPatient(int id,String name,int age,int days,double charge){
super(id,name,age);
this.daysAdmitted=days;
this.dailyCharge=charge;
}
double calculateBill(){
return daysAdmitted*dailyCharge;
}
public void addRecord(String record){
setDiagnosis(record);
}
public String viewRecords(){
return getDiagnosis();
}
}
class OutPatient extends Patient implements MedicalRecord{
private double consultationFee;
OutPatient(int id,String name,int age,double fee){
super(id,name,age);
this.consultationFee=fee;
}
double calculateBill(){
return consultationFee;
}
public void addRecord(String record){
setDiagnosis(record);
}
public String viewRecords(){
return getDiagnosis();
}
}
public class HospitalTest{
static void processPatient(Patient p){
p.getPatientDetails();
System.out.println(p.calculateBill());
}
public static void main(String[] args){
Patient p1=new InPatient(1,"Amit",45,5,2000);
Patient p2=new OutPatient(2,"Riya",30,800);
Patient[] patients={p1,p2};
for(Patient p:patients){
processPatient(p);
}
}
}

