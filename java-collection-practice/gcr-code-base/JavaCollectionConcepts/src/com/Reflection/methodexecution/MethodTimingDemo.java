package com.Reflection.methodexecution;
import java.lang.reflect.Method;

public class MethodTimingDemo {

    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();

        System.out.println(methodName + " execution time: " + (end - start) + " ns");
    }

    public static void main(String[] args) throws Exception {
        SampleTask task = new SampleTask();
        measureExecutionTime(task, "performTask");
    }
}

class SampleTask {
    public void performTask() {
        for (int i = 0; i < 100000; i++);
        System.out.println("Task completed");
    }
}
