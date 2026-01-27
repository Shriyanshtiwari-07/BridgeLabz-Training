package com.Annotations.todo;
import java.lang.reflect.Method;

public class ProjectTasks {

    @Todo(task = "Add login feature", assignedTo = "Bob", priority = "HIGH")
    public void feature1() {}

    @Todo(task = "Fix UI bug", assignedTo = "Alice")
    public void feature2() {}

    public static void main(String[] args) {
        for (Method m : ProjectTasks.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + ", Assigned To: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}
