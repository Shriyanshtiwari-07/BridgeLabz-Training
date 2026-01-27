package com.exception.trywithresources;
import java.io.*;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader br = new BufferedReader(new FileReader("info.text"))){
			
			String firstLine = br.readLine();
			System.out.print(firstLine);
		}
		catch(IOException e) {
			System.out.println("Error Reading file..");
		}
	}

}