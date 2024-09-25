package Day_13_Dynamic;

import java.sql.*;
;

public class Question_3_RetrieveData {
	public static void main(String[] args) throws SQLException {
		try {
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "MyDB11AM", "123");
			System.out.println("Connection Establish Succecfully");
			
			PreparedStatement ps = con.prepareStatement("SELECT STD_ID, STD_NAME, STD_MARKS FROM STUDENTS WHERE STD_MARKS=?");
			
//			set the index of array and database
			ps.setInt(1,Integer.parseInt(args[0]));
			
//			get the data
			ResultSet rs = ps.executeQuery();
			
//			get the metadata field 
			ResultSetMetaData rm = rs.getMetaData();
			int colmunNum = rm.getColumnCount();
			for(int i=1; i<=colmunNum;i++) {
				System.out.print(rm.getColumnName(i)+"\t");
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

