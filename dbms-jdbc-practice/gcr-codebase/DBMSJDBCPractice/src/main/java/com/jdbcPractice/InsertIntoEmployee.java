package com.jdbcPractice;
import java.sql.*;

public class InsertIntoEmployee{
	
		public static void insertemployees(String name, String email, int age) {
			
			String sql = "Insert into employee(emp_name, email, age) values(?,?,?)";
			
			try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt =con.prepareStatement(sql)){
					pstmt.setString(1, name);
					pstmt.setString(2, email);
					pstmt.setInt(3, age);
					
					int rowAffected = pstmt.executeUpdate();
					System.out.println(rowAffected+" row(s) inserted successfully!");
				
			}
			catch(SQLException e) {
				System.out.println("Insert failed: " + e.getMessage());
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			insertemployees("Shriyansh", "shri345@email.com", 20);
			insertemployees("Ravi", "Ravi34556@email.com", 22);
			}
	}
		

