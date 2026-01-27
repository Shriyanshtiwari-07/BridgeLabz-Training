package com.Annotations.logexecution;
import java.lang.reflect.Method;

public class ExecutionDemo {

    @LogExecutionTime
    public void processData() throws InterruptedException {
        Thread.sleep(500); // simulate processing
        System.out.println("Processing done");
    }

    @LogExecutionTime
    public void loadData() throws InterruptedException {
        Thread.sleep(300);
        System.out.println("Loading done");
    }

    public static void main(String[] args) throws Exception {
        ExecutionDemo demo = new ExecutionDemo();
        for (Method method : ExecutionDemo.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(demo);
                long end = System.nanoTime();
                System.out.println(method.getName() + " executed in " + (end - start) + " ns");
            }
        }
    }
}
