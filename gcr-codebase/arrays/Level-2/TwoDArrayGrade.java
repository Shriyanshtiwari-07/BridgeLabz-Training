import java.util.Scanner;

public class TwoDArrayGrade
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter the no. of students: ");
	number = input.nextInt();
	int[][] marksArr = new int[number][3];
	int[] percentArr = new int[number];
	String[] gradeArr = new String[number];	

	for(int i=0; i<number; i++)
	{
 	    System.out.println("Enter details for Student:-- " + (i+1));
	    int phyMarks, cheMarks, mathMarks;
	    System.out.print("Enter Physics Marks: ");
	    phyMarks = input.nextInt();
	    while(phyMarks < 0)
	    {
		System.out.print("Invalid marks, Enter Physics Marks Again: ");
		phyMarks = input.nextInt();
	    }
	    marksArr[i][0] = phyMarks;  // physics marks input done
	    System.out.print("Enter Chemistry Marks: ");
	    cheMarks = input.nextInt();
	    while(cheMarks < 0)
	    {
		System.out.print("Invalid marks, Enter Chemistry Marks Again: ");
		cheMarks = input.nextInt();
	    }
	    marksArr[i][1] = cheMarks;  // chemistry marks input done
	    System.out.print("Enter Maths Marks: ");
	    mathMarks = input.nextInt();
	    while(mathMarks < 0)
	    {
		System.out.print("Invalid marks, Enter Maths Marks Again: ");
		mathMarks = input.nextInt();
	    }
	    marksArr[i][2] = mathMarks; // maths marks input done
	    int sum = marksArr[i][0] + marksArr[i][1] + marksArr[i][2];
	    percentArr[i] = (sum*100) / 300;

	    if(percentArr[i] >= 80 && percentArr[i] <= 100)
	    	gradeArr[i] = "Grade A";
	    else if(percentArr[i] >= 70 && percentArr[i] <= 79)
	    	gradeArr[i] = "Grade B";
	    else if(percentArr[i] >= 60 && percentArr[i] <= 69)
	    	gradeArr[i] = "Grade C";
	    else if(percentArr[i] >= 50 && percentArr[i] <= 59)
	    	gradeArr[i] = "Grade D";
	    else if(percentArr[i] >= 40 && percentArr[i] <= 49)
	    	gradeArr[i] = "Grade E";
	    else if(percentArr[i] <= 39 && percentArr[i] >= 0)
	    	gradeArr[i] = "Grade R";
	}
	
	for(int i=0; i<number; i++)
	{
	    if(gradeArr[i] == "Grade A")
	    {	
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Level 4, above agency-normalised standards");
		
	    }
	    else if(gradeArr[i] == "Grade B")
	    {	
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Level 3, at agency-normalised standards");
	    }
	    else if(gradeArr[i] == "Grade C")
	    {	
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Level 2, below but approaching agency-normalised standards");
	    }
	    else if(gradeArr[i] == "Grade D")
	    {	
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Level 1, well below agency-normalised standards");
	    }
	    else if(gradeArr[i] == "Grade E")
	    {	
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Level 1-, too below agency-normalised standards");
	    }
	    else if(gradeArr[i] == "Grade R")
	    {
		System.out.print("Student " + (i+1) + " marks are: ");
		System.out.println(marksArr[i][0] + ", " + marksArr[i][1] + ", " + marksArr[i][2]);
		System.out.println("His percentage is: " + percentArr[i]);
		System.out.print(gradeArr[i] + " : ");
	        System.out.println("Remedial Standards");
	    }
	}
	
    }
}