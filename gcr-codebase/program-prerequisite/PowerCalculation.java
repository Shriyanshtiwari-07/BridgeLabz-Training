package javaFundamentals.Week1.day1.Self.Question3;

import java.util.Scanner;

public class PowerCalculation{
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter base: ");
            double base = sc.nextDouble();

            System.out.print("Enter exponential: ");
            double exponential = sc.nextDouble();

            float power = (float) Math.pow(base, exponential);

            System.out.println("Power = " + power);

            sc.close();
        }
}