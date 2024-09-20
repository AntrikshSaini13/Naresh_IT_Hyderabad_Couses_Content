package Day_13;

import java.sql.*;


public class Question_4_RetrieveData{
	 public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "MyDB11AM", "123");
			System.out.println("Connection Establish Succecfully");
			
//			PreparedStatement Interface used for dynamic Query method is perparedSatement()
			PreparedStatement ps = con.prepareStatement("SELECT STD_NAME FROM STUDENTS WHERE STD_ID = ?");
			
			ps.setInt(1,101);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
