package Day_19_RowSet;

import java.sql.*;

import oracle.jdbc.rowset.*;

public class Question_2_CachedRowSet {
	public static void main(String[] args) {
		try {
			
			// Instance final Variable
			final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
			final String USER_NAME = "MYDB11AM";
			final String PASSWARD = "123";
			
//			thii is a UpCasting of 
			OracleCachedRowSet crs= new OracleCachedRowSet(); // Up Casting 
			
//			Connection Established by using Method 
			crs.setUrl(URL);
			crs.setUsername(USER_NAME);
			crs.setPassword(PASSWARD);
			crs.setCommand("Select * from Students");
			crs.execute();
			
//			Get the data by using ResultSet Interface from the database
			
			ResultSetMetaData rm = crs.getMetaData();
			int numCol = rm.getColumnCount();
			for(int i = 1;i<=numCol;i++) {
				System.out.print(rm.getColumnName(i)+"\t\t");
			}			
			while(crs.next()) {
				System.out.print("\n"+crs.getInt(1)+"\t\t");
				System.out.print(crs.getString(2)+"\t\t");
				System.out.print(crs.getInt(3)+"\t\t \n");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
	}
}
