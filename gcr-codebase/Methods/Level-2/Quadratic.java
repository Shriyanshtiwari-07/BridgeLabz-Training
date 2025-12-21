import java.util.Scanner;

public class Quadratic
{
    public static double[] findRootsPos(int a, int b, int delta)
    {
	double root1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double root2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        return new double[]{root1, root2};
    }

    public static double findRootsNeg(int a, int b)
    {
	double root = (-b)/(2*a);
	return root;
    }

    public static void findRoot(int a, int b, int c)	
    {
	int delta = (b * b) - (4 * a * c);
	if(delta > 0) 
	{
	    double[] arr = findRootsPos(a, b, delta);
	    System.out.println("Delta is positive");
	    System.out.println("root 1 is: " + (arr[0]));
	    System.out.println("root 2 is: " + (arr[1]));
	    return;
	}
	else if(delta == 0)
	{
	    double res = findRootsNeg(a, b);
	    System.out.println("Delta is positive");
	    System.out.println("root is: " + res);
	    return;
	}
	System.out.println("Delta is Negative");
    }

    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	int a, b, c;
	System.out.print("Enter Value of a: ");
	a = input.nextInt();
	System.out.print("Enter Value of b: ");
	b = input.nextInt();
	System.out.print("Enter Value of c: ");
	c = input.nextInt();
	
	findRoot(a, b, c);
	input.close();
    }
}