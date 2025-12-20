import java.util.Scanner;

public class CheckNumbers{
	public static int checkNumbers(int number){
		if (number>0){
			System.out.println("The number is positive");
			 return 1;
		}
		else if(number < 0){
			System.out.println("The number is negative");
			return -1;
		}
		else{
			System.out.println("The number is Zero");
			return 0;
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int checknumber = checkNumbers(number);
		
		
	 }
	
	}
	
