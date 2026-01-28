
package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.JUnit.performancetesting.TaskRunner;

import java.util.concurrent.TimeUnit;

public class TaskRunnerTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        TaskRunner runner = new TaskRunner();
        runner.longRunningTask();
    }
}
