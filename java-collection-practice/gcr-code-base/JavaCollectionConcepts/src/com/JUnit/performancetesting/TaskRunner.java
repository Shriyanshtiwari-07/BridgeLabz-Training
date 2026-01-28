package com.JUnit.performancetesting;
public class TaskRunner {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "done";
    }
}
