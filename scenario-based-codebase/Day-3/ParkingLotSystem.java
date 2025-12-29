import java.util.Scanner;

public class ParkingLotSystem{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int capacity = 5;
        int occupied= 0;
		int choice;
     while(true){
		 System.out.println("/n1.Park vehicle");
		 System.out.println("2.Exit vehicle");
		 System.out.println("3.Show Occupency");
		 System.out.println("4.Exit System");
		 
		 System.out.println("Enter your choice: ");
		 choice = sc.nextInt();
		 
		 switch(choice){
			 case 1:
			 if(occupied< capacity){
				 occupied ++;
				 System.out.println("Vehicle Parked Successfully");
			 }else{
				 System.out.println("Parking Lot is full\nThankyou for the visit");
				 return;
			 }
			 break;
		     case  2:
			 if(occupied >0){
				 occupied--;
				 System.out.println("Vehicles Exited Successfully");
				 }else{
					 System.out.println("No vehicles Available to exit.");
			     }
                   break;		
		      case 3:
			  System.out.println("Occupied Slots: " + occupied);
			  System.out.println("Available Slots: " + (capacity - occupied));
		           break;
			  case 4: 
               System.out.println("Exiting Vehicle System.");
                return;			   
 				 
		        default:
				System.out.println("Invalid Choice.Try Again");
		    }
		 }
	}
}