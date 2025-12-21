import java.util.Scanner;

public class CheckUnitConverterThree
{
    public static double convertFarhenheitToCelsius(double farhenheit)
    {
  	return (farhenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFarhenheit(double celcius)
    {
  	return (celcius * 9 / 5) + 32;		
    }
    public static double convertPoundToKg(double pound)
    {
  	return pound*0.453592;
    }
    public static double convertKgToPound(double kg)
    {
  	return kg*2.20462;
    }
    public static double convertgallonToLitre(double gallon)
    {
  	return gallon*3.78541;
    } 
    public static double convertLitreToGallon(double litre)
    {
  	return litre*0.264172;
    }  

    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	double farhenheit, celcius, pound, kg, gallon, litre;
	System.out.print("Enter farhenheit value: ");
	farhenheit = input.nextDouble();
	System.out.print("Enter celcius value: ");
	celcius = input.nextDouble();
	System.out.print("Enter pound value: ");
	pound = input.nextDouble();
	System.out.print("Enter kg value: ");
	kg = input.nextDouble();
	System.out.print("Enter gallon value: ");
	gallon = input.nextDouble();
	System.out.print("Enter litre value: ");
	litre = input.nextDouble();
		
  	System.out.println("From farhenheit to celcius: " + convertFarhenheitToCelsius(farhenheit));
	System.out.println("From celcius to farhenheit: " + convertCelsiusToFarhenheit(celcius));
	System.out.println("From pound to kg: " + convertPoundToKg(pound));
	System.out.println("From kg to pound: " + convertKgToPound(kg));
	System.out.println("From gallon to litre: " + convertgallonToLitre(gallon));
	System.out.println("From litre to gallon: " + convertLitreToGallon(litre));
    }
}