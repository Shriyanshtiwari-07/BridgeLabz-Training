import java.util.*;

public class SpringSeason{
	public static boolean checkSeason(String month,int day){
		
     if((month.equals("march") && day >=20 && day<=31) || (month.equals("may") && day >=1 && day <=30 ) || (month.equals("june") && day>=1 && day<=20)){
		 //System.out.println("This is considered as Spring Season");
		 return true;
	 }
	 return false;
	}
		public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter month: ");
			String month = sc.next();
			
		System.out.println("Enter Day: ");
			int day = sc.nextInt();	
		 
		 boolean checked = checkSeason(month, day);
		 
		 
		 
		 if (checked){
			 System.out.println("This is considered as Spring Season");
			 }
		 else{
				 System.out.println("This is not considered as Spring Season");
			 }
	    }
	}