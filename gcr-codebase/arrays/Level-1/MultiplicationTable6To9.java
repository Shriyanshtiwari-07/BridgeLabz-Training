import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
   for(int number =6 ; number<=9 ; number++){
      int[] multiplicationResult = new int[10];
	  
	  for(int i=1;i<=10 ; i++){
	  multiplicationResult[i - 1] = number * i;
	  }
	  System.out.println("Multiplication table of " + number + "is :");
	  for (int i=1; i<= 10; i++){
	  System.out.println("number" + "*" + "i" + "=" + multiplicationResult[i - 1]);
	  }
   }

}
}