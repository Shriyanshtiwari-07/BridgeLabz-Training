package com.Reflection.staticfields;
import java.lang.reflect.Field;

public class StaticFieldReflectionDemo {

    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "NEW_KEY"); // static field, pass null

        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
    }
}
