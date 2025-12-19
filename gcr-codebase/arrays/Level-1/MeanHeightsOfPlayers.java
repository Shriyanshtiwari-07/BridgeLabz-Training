import java.util.Scanner;

public class MeanHeightsOfPlayers {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double[] heights = new double[11];
	double sum =0.0;
	
	System.out.println("Enter the 11 football player Team: ");
	
	for(int i =0 ; i<heights.length; i++){
	heights[i]= sc.nextDouble();
	sum += heights[i];
	}
	Double meanheight= sum/heights.length;
	
	System.out.println("The mean height of average players: " + meanheight);
	
	
	}
}