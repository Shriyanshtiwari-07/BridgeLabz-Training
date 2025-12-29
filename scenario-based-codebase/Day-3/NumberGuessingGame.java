import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
	public static void main (String[] args){
		Scanner sc =new Scanner(System.in);
		Random random=new Random();
		
		int number = random.nextInt(100+1);
        int guess;
        int attempts=0;
        int maxattempts=5;
        
     do{
		 System.out.println("Enter number from(1 to 100): ");
		 guess = sc.nextInt();
		 attempts ++;
		 
		 if(guess>number){
			 System.out.println("Too high");
		 }else if(guess<number){
			 System.out.println("Too low");
		 }else{
			 System.out.println("The number you entered is correct and you got it in " + attempts + " attempts");
			 return;
		 }
		 
	 }	 while(attempts< maxattempts);
		
	System.out.println("Game Over! You have reached your maximum attempts");
	System.out.println("The number is " + number);
	     
		
	}
	
}