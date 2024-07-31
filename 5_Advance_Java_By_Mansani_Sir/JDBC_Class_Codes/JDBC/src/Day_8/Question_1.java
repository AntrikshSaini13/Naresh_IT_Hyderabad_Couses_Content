package Day_8;

import java.sql.*;

class Question_1 {

	//Established The Connection Between Database and Application which used to Type-4 Driver
	
	public static void main(String[] args) throws SQLException {
		try {
			// Loading the Specfic Driver
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection Established b/n application and database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MYDB11AM", "123");
			System.out.println("Connection is Established SucessFully");
			
		} catch (ClassNotFoundException e) {
			System.err.println("Connection is not Established");
		}
	}
}

