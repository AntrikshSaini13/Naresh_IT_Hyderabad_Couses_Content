package Day_13_Dynamic;

import java.sql.*;

public class Question_5_CreateTable {
	public static void main(String[] args) throws SQLException {
		
		// Instance final Variable
		final String DRIVER = "oracle.jdbc.driver.OracleDriver";
		final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		final String USER_NAME = "MYDB11AM";
		final String PASSWARD = "123";
		
		try {
			Class.forName(DRIVER);
			
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWARD);
			
//			PreparedStatement Interface used for dynamic Query method is perparedSatement()
			PreparedStatement ps = conn.prepareStatement("create table students(std_id number(20), std_name varchar2(30), std_marks number(20))");
			
			ps.execute();
			System.out.println("Create table Sucessfully");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
//			e.printStackTrace();
		}
		catch (Exception e) {
			e.getMessage();
//			e.getStackTrace();
		}
		
	}
}
