import java.util.Scanner;

public class QuotientAndRemainder{
public static int[] quotientRemainder(int number, int divisor){
  int quotient = number /divisor;
  int remainder = number%divisor;
     return new int[] {quotient , remainder};
	 
}

public static void main (String[] args) {
	int quotient;
	int remainder;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int number = sc.nextInt();
	
		System.out.println("Enter the divisor: ");
     	int divisor = sc.nextInt();
	
	
	int[] result = quotientRemainder(number,divisor);
	
	System.out.println("The quotient of the given number is " + result[0] + " and the remainder will be " + result[1]);
     	
	
}
      
}