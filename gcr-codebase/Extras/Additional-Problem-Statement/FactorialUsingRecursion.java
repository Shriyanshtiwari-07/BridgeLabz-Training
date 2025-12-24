import java.util.Scanner;

public class FactorialUsingRecursion
{
    public static int takeInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static long factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long result)
    {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String args[])
    {
        int num = takeInput();
        long result = factorial(num);
        displayResult(num, result);
    }
}