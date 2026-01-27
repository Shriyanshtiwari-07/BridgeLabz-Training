package com.Annotations.importantmethod;
import java.lang.reflect.Method;

public class ImportantDemo {

    @ImportantMethod
    public void taskA() {}

    @ImportantMethod(level = "LOW")
    public void taskB() {}

    public static void main(String[] args) {
        for (Method m : ImportantDemo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " - Level: " + im.level());
            }
        }
    }
}
