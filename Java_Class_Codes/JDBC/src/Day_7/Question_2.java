package Day_7;

import java.sql.Connection;
import static java.sql.DriverManager.*;
import java.sql.SQLException;

//Established The Connection Between Database and Application which used to Type-2 Driver

public class Question_2 {
	public static void main(String[] args) throws SQLException {
		try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDrier");
			Connection con = getConnection("jdbc:oracle:oci8:@MYSYSTEM", "MYDB11AM", "123!");
			System.err.println("Connection isn't Established");
		} catch (ClassNotFoundException e) {
			System.err.println("Connection isn't Established");			
		}		
	}
}
