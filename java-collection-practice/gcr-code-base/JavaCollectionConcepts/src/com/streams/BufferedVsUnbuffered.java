package com.streams;
import java.io.*;

public class BufferedVsUnbuffered {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) throws IOException {
        File source = new File("largefile.dat");

        // Unbuffered
        long start = System.nanoTime();
        copyUnbuffered(source, "unbuffered.dat");
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) + " ns");

        // Buffered
        start = System.nanoTime();
        copyBuffered(source, "buffered.dat");
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) + " ns");
    }

    static void copyUnbuffered(File source, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void copyBuffered(File source, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}
