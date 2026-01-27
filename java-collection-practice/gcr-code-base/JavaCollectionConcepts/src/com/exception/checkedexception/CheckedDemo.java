package com.exception.checkedexception;
import java.io.*;

public class CheckedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
			fr.close();
		}
		catch(IOException e) {
			System.out.println("File Not Found...");
		}
	}

}