package Day_7;

import java.sql.*;

public class Question_1 {

	public static void main(String[] args) throws SQLException {
		try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDrier");
			Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@MYSYSTEM", "MYDB11AM", "123");
			System.err.println("Connection isn't Established");
		} catch (ClassNotFoundException e) {
			System.err.println("Connection isn't Established");			
		}		
	}

}
