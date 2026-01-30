package com.csvdata.writecsv;
import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Aman,IT,50000\n");
        bw.write("2,Riya,HR,45000\n");
        bw.write("3,Kunal,Finance,60000\n");
        bw.write("4,Neha,IT,70000\n");
        bw.write("5,Rohit,Sales,48000\n");

        bw.close();
    }
}
