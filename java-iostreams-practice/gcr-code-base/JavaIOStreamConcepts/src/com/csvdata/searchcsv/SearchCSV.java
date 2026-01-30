package com.csvdata.searchcsv;
import java.io.*;

public class SearchCSV {
    public static void main(String[] args) throws Exception {
        String searchName = "Neha";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;

        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + d[2]);
                System.out.println("Salary: " + d[3]);
            }
        }
        br.close();
    }
}
