import java.util.Scanner;
public class ShopKeeperDiscount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final double discount_10 = 0.10;
        final double discount_05 = 0.05;	
		
		int totalbill = 0;
		double discount;
		double final_amount;
		
		System.out.println("Enter the number of Items: ");
	    int items = sc.nextInt();
		
		for(int i=0 ; i <= items; i++){
			System.out.println("Enter the price of items " + i + ": ");
			double price = sc.nextDouble();
			totalbill += price;
			}
			
			if(totalbill>500){
				discount = totalbill*discount_10;
			}else if(totalbill<1000){
				discount =totalbill*discount_05;
	        }else{
		         discount=0;
	       }
		      final_amount = totalbill-discount;
		   System.out.println("Total Bill : " + totalbill);
		   System.out.println("Discount Applied : " + discount);
		   System.out.println("Amount to be payed: " + final_amount);	
	}
	
}