package Day_17.StdImage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Question_2_Dynamic_Get_Image {
	public static void main(String[] args) throws SQLException {
		// Instance final Variable
		final String DRIVER = "oracle.jdbc.driver.OracleDriver";
		final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		final String USER_NAME = "MYDB11AM";
		final String PASSWARD = "123";
		
		try {
			Class.forName(DRIVER);
			
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWARD);
			
			PreparedStatement pstmt = conn.prepareStatement("SELECT STD_NAME FROM Studentimage");
			
//			pstmt.setString(1, "Antriksh");
			
			ResultSet rs = pstmt.executeQuery();
			
			ResultSetMetaData rm = rs.getMetaData();
			
			int numCol = rm.getColumnCount();
			
			for(int i=1; i<=numCol; i++) {
				System.out.print(rm.getColumnName(i)+ "\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
//				System.out.println(rs.getBinaryStream(1)+"\t");
				System.out.println();
			}			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.getMessage();
			e.printStackTrace();
		}
	}
}
