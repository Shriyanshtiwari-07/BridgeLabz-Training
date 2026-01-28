package com.Reflection.dynamicmethodinvoke;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {
        MathOperations math = new MathOperations();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = sc.nextLine();

        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(math, 10, 5);
        System.out.println("Result: " + result);

        sc.close();
    }
}
