import java.util.Scanner;

public class CoffeeBilling{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
final double gst_rate = 0.05;


System.out.print("Enter the coffee name: ");
String name = sc.nextLine();


while(true){
	System.out.println("/nEnter the coffee name (Espresso/Americano/Latte/Mocha) or typr 'exit' to stop: ");
	String coffeeType = sc.nextLine();
	
	if (coffeeType.equalsIgnoreCase("exit")){
		System.out.println("Thankyou for visiting the Ravi's caffe.");
		break;
	}
	
	System.out.print("Enter quantity: ");
	int quantity = sc.nextInt();
	
   double price = 0;
   
   switch(coffeeType.toLowerCase()){
	   case  "espresso":
	   price = 120;
	   break;
	   
	   case  "americano":
	   price = 140;
	   break;
	   
	   case "mocha":
	   price= 100;
	   
	   case  "Latte":
	   price = 110;
	   break;
	   default:
	   System.out.println("Invalid Coffee Type: ");
	   continue;
	   }
	double total = price * quantity;
	double gst  = gst_rate * total;
	double finalBill = total + gst_rate;
	

    System.out.println("Base Amount: " + total);
	System.out.println("GST (5%)= " + gst_rate);
	System.out.println("final Bill= " + finalBill);

       }

   }
}