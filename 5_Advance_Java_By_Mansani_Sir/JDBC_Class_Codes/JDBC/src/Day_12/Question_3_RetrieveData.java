package Day_12;

import java.sql.*;

//This program to Insert data  table in Database

public class Question_3_RetrieveData {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MYDB11AM", "123");
			Statement st = con.createStatement();		
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
			ResultSetMetaData rm = rs.getMetaData();
			int columnNum = rm.getColumnCount();
			for(int i = 1; i <= columnNum; i++) {
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int i = 1; i <= columnNum; i++) {
					System.out.print(rs.getString(i)+"\t");
				}	
				System.out.println();
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
