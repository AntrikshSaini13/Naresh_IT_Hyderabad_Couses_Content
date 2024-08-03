package Day_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Question_4 {
	 public static void main(String[] args) throws SQLException {
		 try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MyDB11AM", "123");
			System.out.println("Connection Establish Succecfully aaman");
			
//			PreparedStatement Interface used for dynamic Query method is perparedSatement()
			PreparedStatement ps = con.prepareStatement("SELECT STD_NAME FROM STUDENTS WHERE STD_MARKS = ?");
			
			ps.setInt(1,Integer.parseInt(args[0]));
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
