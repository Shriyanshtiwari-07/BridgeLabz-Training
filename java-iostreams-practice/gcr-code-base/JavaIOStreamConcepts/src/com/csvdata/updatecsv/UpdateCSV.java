package com.csvdata.updatecsv;
import java.io.*;

public class UpdateCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));

        String line = br.readLine();
        bw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equals("IT")) {
                double salary = Double.parseDouble(d[3]);
                d[3] = String.valueOf(salary * 1.10);
            }
            bw.write(String.join(",", d) + "\n");
        }
        br.close();
        bw.close();
    }
}
