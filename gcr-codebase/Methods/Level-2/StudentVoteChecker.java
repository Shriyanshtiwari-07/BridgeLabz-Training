import java.util.Scanner;

public class StudentVoteChecker
{
    public static boolean canStudentVote(int age)
    {
	if(age >= 18)
	    return true;
	return false;
    }
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int[] students = new int[10];
	for(int i=0; i<10; i++)
	{
	    System.out.print("Enter Student " + (i+1) + " age: ");
	    students[i] = input.nextInt();
	    if(canStudentVote(students[i]))
		System.out.println("Yes, Student " + (i+1) + " can vote");
	    else	
		System.out.println("No, Student " + (i+1) + " cannot vote");
	}	
    }
}