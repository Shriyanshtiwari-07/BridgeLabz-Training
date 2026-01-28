package com.JUnitTests;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

import com.JUnit.filehandling.FileProcessor;

public class FileProcessorTest {

    @Test
    public void testWriteAndReadFile() throws IOException {
        FileProcessor fp = new FileProcessor();
        String filename = "test.txt";
        String content = "Hello World";

        fp.writeToFile(filename, content);
        assertTrue(Files.exists(Paths.get(filename)));
        assertEquals(content, fp.readFromFile(filename));
    }

    @Test
    public void testFileNotFound() {
        FileProcessor fp = new FileProcessor();
        assertThrows(IOException.class, () -> fp.readFromFile("nonexistent.txt"));
    }
}
