package com.jdbcPractice;
import java.sql.*;

public class InsertIntoEmployee2{
	
		public static void insertemployees(String name, String email, int age,double salary, int year) {
			
			String sql = "Insert into employee(emp_name, email, age,emp_salary, join_year) values(?,?,?,?,?)";
			
			try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt =con.prepareStatement(sql)){
					pstmt.setString(1, name);
					pstmt.setString(2, email);
					pstmt.setInt(3, age);
					pstmt.setDouble(4, salary);
					pstmt.setInt(5, year);
					int rowAffected = pstmt.executeUpdate();
					System.out.println(rowAffected+" row(s) inserted successfully!");
				
			}
			catch(SQLException e) {
				System.out.println("Insert failed: " + e.getMessage());
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			insertemployees("Shriyansh", "shri345@email.com", 20, 30000, 2018);
			insertemployees("Ravi", "Ravi34556@email.com", 22, 35000, 2014);
			}
	}
		