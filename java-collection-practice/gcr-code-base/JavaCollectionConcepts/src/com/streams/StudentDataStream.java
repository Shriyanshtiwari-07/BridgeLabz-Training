package com.streams;
import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
            dos.writeInt(101);
            dos.writeUTF("John");
            dos.writeDouble(3.8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println("Roll: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("GPA: " + dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
