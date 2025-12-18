import java.util.Scanner;

public class VoteAge{
  public static void main (String[] args){
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();   
  
  if (number>18){
  System.out.println("The Person's age is " + number + " and can vote");
  } else{
  System.out.println("The Person's age is " + number + " and cannot vote");
   }
  }
}