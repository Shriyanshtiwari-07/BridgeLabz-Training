import java.util.Scanner;
import java.util.Arrays;

public class FactorsOfNumberMethods
{
    public static int[] findFactors(int number)
    {
	int maxFactor = 10;
	int originalNo = number;
	int[] factorArr = new int[maxFactor];
	int index = 0;
	
	for(int strt=1; strt<=number; strt++)
	{
	    if(number%strt == 0)
	    {
		if(index == maxFactor)
		{
		    maxFactor = maxFactor*2;
		    factorArr = Arrays.copyOf(factorArr, maxFactor);
		}
		factorArr[index++] = strt;
	    }
	}
	return factorArr;
    }
    public static long totalSumOfFactors(int[] factorArr)
    {
	long totalSum = 0; 
	for(int i=0; i<factorArr.length; i++)
	{   
	    totalSum += factorArr[i];
	}
	return totalSum;
    }
    public static long totalProductOfFactors(int[] factorArr)
    {
	long totalProd = 1; 
	for(int i=0; i<factorArr.length; i++)
	{
	    if(factorArr[i] == 0) break;
	    totalProd *= factorArr[i];
	}
	return totalProd;
    }
    public static long sumOfSquareOfFactors(int[] factorArr)
    {
	long sumOfSquare = 0; 
	
	for(int i=0; i<factorArr.length; i++)
	{
	    long square = factorArr[i]*factorArr[i]; 
	    sumOfSquare += square;	    
	}
	return sumOfSquare;
    }
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter Number: ");
	number = input.nextInt();	

	int[] factorArr = findFactors(number);	
	System.out.print("Factors are: ");	
	for(int i=0; i<factorArr.length; i++)
	{   
	    if(factorArr[i] == 0) break;
	    System.out.print(factorArr[i] + ", ");
	}
	long totalSum = totalSumOfFactors(factorArr);
	long totalProd = totalProductOfFactors(factorArr);
	long sumOfSquareOfFactors = sumOfSquareOfFactors(factorArr); 
	
	System.out.println(" ");
	System.out.println("The Total sum of Factors: " + totalSum);   
	System.out.println("The Total product of Factors: " + totalProd); 
	System.out.println("The Total sum of square of Factors: " + sumOfSquareOfFactors); 
    }
}