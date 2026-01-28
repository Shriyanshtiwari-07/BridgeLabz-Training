package com.csvdata.csvtoobject;
import java.io.*;
import java.util.*;

public class CSVToObject {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        List<Student> list = new ArrayList<>();
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            Student s = new Student();
            s.id = Integer.parseInt(d[0]);
            s.name = d[1];
            s.age = Integer.parseInt(d[2]);
            s.marks = Integer.parseInt(d[3]);
            list.add(s);
        }
        br.close();
        list.forEach(System.out::println);
    }
}
