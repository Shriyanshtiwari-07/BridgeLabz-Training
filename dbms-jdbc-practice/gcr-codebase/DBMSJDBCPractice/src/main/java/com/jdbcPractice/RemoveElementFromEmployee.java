package com.jdbcPractice;
import java.sql.*;
public class RemoveElementFromEmployee {
   public static void deleteemployee(int emp_id) {
			
			String sql = "delete from employee where emp_id = ?";
			
			try(Connection con = DatabaseConnection.getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql)){
				pstmt.setInt(1,emp_id);
				
				int rowsAffected = pstmt.executeUpdate();
				
				System.out.println(rowsAffected+" row(s) affected");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public static boolean deleteemployeeSafe(int emp_id) {
			String checkSql = "Select count(*) from employee where emp_id=?";
			String deleteSql = "Delete from employee where emp_id=?";
			
			try(Connection con = DatabaseConnection.getConnection();){
				try(PreparedStatement checkStmt = con.prepareStatement(checkSql)){
					checkStmt.setInt(1, emp_id);
					ResultSet rs =checkStmt.executeQuery();
					rs.next();
					if(rs.getInt(1)==0) {
						System.out.println("Employee not found");
						return false;
					}
				}
				try (PreparedStatement deleteStmt = con.prepareStatement(deleteSql)) {
					deleteStmt.setInt(1, emp_id);
					deleteStmt.executeUpdate();
					System.out.println("Employee deleted successfully!");
					return true;
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		public static void main(String[] args) {
			deleteemployeeSafe(2);
		}
	}
	
	

