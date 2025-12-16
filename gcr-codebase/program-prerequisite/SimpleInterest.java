package javaFundamentals.Week1.day1.Self.Question1;


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount :");
        int principal = sc.nextInt();

        System.out.println();

        System.out.print("Enter rate :");
        int rate = sc.nextInt();

        System.out.println();

        System.out.print("Enter time :");
        int time = sc.nextInt();

        double simpleInterest = (principal*rate*time)/100;

        System.out.println("Principal interest =" + simpleInterest);

        sc.close();
    }    
}
