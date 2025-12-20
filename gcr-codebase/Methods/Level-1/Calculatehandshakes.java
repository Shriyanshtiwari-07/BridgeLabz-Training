import java.util.Scanner;

public class Calculatehandshakes{
public static int calculateHandshakes(int numberofstudents){
int handshakes  = (numberofstudents * (numberofstudents-1))/2;
return handshakes;
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of Students: ");
int numberofstudents = sc.nextInt();

int result =calculateHandshakes(numberofstudents);

System.out.println("The number of handshakes are: " + result );


}


}