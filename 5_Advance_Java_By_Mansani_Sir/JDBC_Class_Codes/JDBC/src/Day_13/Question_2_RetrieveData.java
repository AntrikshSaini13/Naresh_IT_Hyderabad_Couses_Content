package Day_13;

import java.sql.*;

//Program for Dynamic Query which is used to Retrieve the data from database use only DQL Query only
public class Question_2_RetrieveData {
	 public static void main(String[] args) throws SQLException {
		try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MyDB11AM", "123");
			System.out.println("Connection Establish Succecfully");
			
//			PreparedStatement Interface used for dynamic Query method is perparedSatement()
			PreparedStatement ps = con.prepareStatement("SELECT * FROM STUDENTS");
			
//			ResultSet Interface for get the data form database
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rm = rs.getMetaData();
			int columnNum = rm.getColumnCount();
			for(int i=1; i<=columnNum; i++) {
				System.out.print(rm.getColumnName(i)+"\t");;
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getInt(3)+"\t");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
