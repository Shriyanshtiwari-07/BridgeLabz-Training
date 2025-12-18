import java.util.Scanner;

public class CountDown{
   public static void main (String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Start the countdown number: ");
   
   int counter = input.nextInt();
   while(counter>=1){
    System.out.println(counter);
	counter--;
	}
	System.out.println("Launch");
	}
	}