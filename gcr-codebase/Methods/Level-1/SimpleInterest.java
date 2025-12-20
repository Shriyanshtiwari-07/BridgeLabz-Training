import java.util.Scanner;

public class SimpleInterest{
   public static double calculateSimpleInterest(double principle,double rate,double time){
   double SimpleInterest = (principle * rate * time)/100;
   return SimpleInterest;
    }
public static void main (String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Enter principle: ");
double principle = input.nextDouble();

System.out.println("Enter rate: ");
double rate = input.nextDouble();

System.out.println("Enter time: ");
double time = input.nextDouble();

double result = calculateSimpleInterest(principle, rate, time);

System.out.println("The Simple Interest of following numbers is : " + result + "for the principle " + principle + "and rate " + rate + "and time " + time);





} 


}
