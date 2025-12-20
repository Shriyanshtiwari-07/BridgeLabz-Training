import java.util.Scanner;
public class TrianglePark{
public static double perimeterofPark(double a , double b , double c){
  double perimeter = a + b + c;
  return perimeter;
} 
public static void main (String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter side a: ");
double a = sc.nextDouble();

System.out.println("Enter side b: ");
double b = sc.nextDouble();

System.out.println("Enter side c: ");
double c = sc.nextDouble();

double perimeter = perimeterofPark(a , b , c);

double rounds = 5000/perimeter;

System.out.println("The number of rounds of sides " + a + b + c + "is: " + rounds);
   }
}