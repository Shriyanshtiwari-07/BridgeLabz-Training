import java.util.Scanner;

public class FibonacciGenerator
{
    public static void generateFibonacci(int number)
    {
        int first = 0, second = 1;
        if(number <= 0)
        {
            System.out.println("Please enter a positive number.");
            return;
        }
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= number; i++)
        {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int number = input.nextInt();

        generateFibonacci(number);
    }
}