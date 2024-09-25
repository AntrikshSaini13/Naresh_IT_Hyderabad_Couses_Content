package Day_19_RowSet;

import java.sql.*;

import javax.sql.rowset.*;

import oracle.jdbc.rowset.*;

public class Question_1_OracleJDBCRowSet {	
	public static void main(String[] args) {
		try {
			
			// Instance final Variable
			final String DRIVER = "oracle.jdbc.driver.OracleDriver";
			final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
			final String USER_NAME = "MYDB11AM";
			final String PASSWARD = "123";
			
//			thii is a UpCasting of 
			OracleJDBCRowSet jrs = new OracleJDBCRowSet(); // Up Casting 
			
//			Connection Established by using Method 
			jrs.setUrl(URL);
			jrs.setUsername(USER_NAME);
			jrs.setPassword(PASSWARD);
			jrs.setCommand("Select * from Students");
			jrs.execute();
			
//			Get the data by using ResultSet Interface from the database
			while(jrs.next()) {
				System.out.print(jrs.getInt(1)+"\t");
				System.out.print(jrs.getString(2)+"\t");
				System.out.print(jrs.getInt(3)+"\t \n");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
	}
}
