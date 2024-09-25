package Day_17.StdImage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

// By using BLOB Data Type insert the data/Image into the data base table

public class Question_1_Dynamic_Insert_Image_BLOB {
	public static void main(String[] args) throws SQLException {
		// Instance final Variable
		final String DRIVER = "oracle.jdbc.driver.OracleDriver";
		final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		final String USER_NAME = "MYDB11AM";
		final String PASSWARD = "123";
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWARD);
		
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO StudentImage values(?, ?) ");
			
			pstmt.setString(1, args[0]);
			
			FileInputStream fis = new FileInputStream(args[1]);
			
			pstmt.setBinaryStream(2, fis, fis.available());
			
			pstmt.executeLargeUpdate();
			
			System.out.println("One Image inserted");
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
	}
}