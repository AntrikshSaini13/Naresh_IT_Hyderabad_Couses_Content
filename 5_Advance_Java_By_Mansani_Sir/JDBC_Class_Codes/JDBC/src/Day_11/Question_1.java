package Day_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//Program to retrieve data from the database by  using executeQuery() method and DQL Query

public class Question_1 {
	public static void main(String[] args) {		
		try {
//			Loading the Specific  Driver 
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Established The Connection between Application and Database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MyDB11AM", "123");
			
//			
			Statement st = con.createStatement();
			
//			
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
			
//			
			ResultSetMetaData  rm = rs.getMetaData();			
			int columnNum = rm.getColumnCount();
			for(int i=1; i<=columnNum; i++) {
				System.out.print(rm.getColumnName(i)+"\t");
			}
			
			System.out.println();
//			here we are passing table Record name
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getInt(3)+"\t");
			}
			
			
		} catch (ClassNotFoundException e) {			
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}


