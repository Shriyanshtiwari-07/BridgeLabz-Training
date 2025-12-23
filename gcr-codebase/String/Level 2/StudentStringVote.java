import java.util.Scanner;

public class StudentStringVote
{
    public static int[] createAge()
    {
	int[] age = new int[10];
	for(int i=0; i<10; i++)
	{	
	    int randomAge = (int)((Math.random() * 90)+10);
	    age[i] = randomAge;
	}
	return age;	
    }	
	
    public static String[][] canStudentVote(int[] age)
    {
	String[][] checkEligibilty = new String[10][2];
	for(int i=0; i<10; i++)
	{
	    checkEligibilty[i][0] = String.valueOf(age[i]);
	    if(age[i] >= 18)
		checkEligibilty[i][1] = "true";
	    
	    else
	    	checkEligibilty[i][1] = "false";
	    
	}
	return checkEligibilty;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int[] age = createAge();
	String[][] checkEligibility= canStudentVote(age);
	
	for(int i=0; i<10; i++)
	{
	    if(checkEligibility[i][1].equals("true"))
	    	System.out.println("Student " + (i+1) + " age is " + checkEligibility[i][0] + " and can vote");
   	    else
		System.out.println("Student " + (i+1) + " age is " + checkEligibility[i][0] + " and cannot vote");
	}
	input.close();
	
    }
}