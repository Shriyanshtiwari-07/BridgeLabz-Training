// Currency Exchange Kiosk 💱
// Design a currency converter:
// Take INR amount and target currency.
// Use a switch to apply the correct rate.
// Ask if the user wants another conversion (do-while).

import java.util.Scanner;

public class CurrencyExchange
{
    public static void exchangeCurrency()
    {
	Scanner input = new Scanner(System.in);
	System.out.println("----------------------Currency Converter ------------------------");
	do
	{
	    double amount;
	    int choice;
	    System.out.println("--------Exchange Currency From INR to (US Dollars / EURO / Iranian Rial / Yuan) -------");
	    System.out.println("Enter Amount in INR: ");
	    amount = input.nextLong();
	    while(amount <= 0)
	    {
		System.out.println("Invalid Please, Enter Valid Amount....");
		System.out.println("Enter Amount in INR: ");
	    	amount = input.nextLong();
	    }
	    System.out.println("Enter Currency to convert: (1-> US Dollars / 2-> EURO / 3-> Iranian Rial / 4-> Yuan)");
	    choice = input.nextInt();
	    double usDollars = 89.84;
	    double euro = 105.35;
	    double iraninaRial = 468.55;
	    double yuan = 12.86;
	
	    double convertedAmount = 0;
	    switch(choice)
	    {
		case 1:
		    convertedAmount = (amount / usDollars);
		    break;
		case 2:
		    convertedAmount = (amount / euro);
		    break;
		case 3:
		    convertedAmount = (amount * iraninaRial);
		    break;
		case 4:
		    convertedAmount = (amount / yuan);
		    break;    
	    }
	    System.out.println("Converted Amount----------: " + convertedAmount);
	    System.out.println("Would to Like to Continue (y/n): ");
	    String isContinue;
	    isContinue = input.next();
	    if(isContinue.equals("n"))
		break;   
	}while(true);
	
    }  

    public static void main(String args[])
    {
	exchangeCurrency();
    }
}