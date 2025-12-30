
// 11. Temperature Logger 🌡️
// Record temperatures over 7 days.
// Use array and for-loop.
// Find average and max temperature.
// Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.Scanner;

public class TemperatureLogger
{
    public static void recordTemperature()
    {
	Scanner input = new Scanner(System.in);
	double[] days = new double[7];
	double totalTemperature = 0;
	double maxTemperature = 0;
	for(int i=0; i<7; i++)
	{
	    System.out.print("Enter Temprature for Day " + (i+1) + ": ");
	    days[i] = input.nextDouble();
	    totalTemperature += days[i];
	    if(days[i] > maxTemperature)
		maxTemperature = days[i];
	}

	double average = totalTemperature / 7;
	System.out.println("The Average Temprature: " + (average));
	System.out.println("The Maximum Temprature: " + (maxTemperature));
    }

    public static void main(String args[])
    {
	recordTemperature();
    }
}