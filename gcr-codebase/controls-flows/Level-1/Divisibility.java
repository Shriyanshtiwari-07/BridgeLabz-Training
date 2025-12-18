import java.util.Scanner;

public class Divisibility{

public static void main (String[] args){
 Scanner input = new Scanner(System.in);
 int number;
number = input.nextInt();
if(number%5 == 0){
 System.out.println("Is the number" + number + "is divisible by 5? Yes" );
} else{
System.out.println("Is the number" + number + "is divisible by 5? No");
    }
  }
 }  
