import java.util.Scanner;

public class FactorialwhileLoop{
public static void main (String[] args){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter an integer: ");
 int num=input.nextInt();
 if(num<0){
  System.out.println("pleae enter valid number");
}
else {
int factorial=1;
int i =1;
while(i<=num){
  factorial = factorial * i;
 i++;
 }
System.out.println("The factorial of " + num + " is " + factorial);
}
}
}