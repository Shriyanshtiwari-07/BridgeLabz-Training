package com.Reflection.ivokeprivatemethod;
import java.lang.reflect.Method;

public class CalculatorReflectionDemo {

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calc, 5, 6);
        System.out.println("Multiplication result: " + result);
    }
}
