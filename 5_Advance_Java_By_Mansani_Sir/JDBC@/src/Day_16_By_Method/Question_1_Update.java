package Day_16_By_Method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Question_1_Update {
	public static void main(String[] args) throws SQLException {
		try {
			// Instance final Variable
			final String DRIVER = "oracle.jdbc.driver.OracleDriver";
			final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
			final String USER_NAME = "MYDB11AM";
			final String PASSWARD = "123";

			// here load the specific Driver Dynamically
			Class.forName(DRIVER);

			// Connection Established between Application and Database
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWARD);

			// this is for Static Query Statement
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			
			// ResultSet get the table and record from the database
			ResultSet rs = stmt.executeQuery("SELECT STD_ID, STD_NAME, STD_MARKS FROM STUDENTS");

			// view the column here
			ResultSetMetaData rm = rs.getMetaData();
			int columnNum = rm.getColumnCount();
			for (int i = 1; i <= columnNum; i++) {
				System.out.print(rm.getColumnName(i) + "\t");
			}
			System.out.println();

			// view the record here
			while (rs.next()) {
				for (int i = 1; i <= columnNum; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}

			rs.absolute(1);
			rs.updateInt(3, 8850);				
			rs.updateRow();
			rs.beforeFirst();

			System.out.println();

			while (rs.next()) {
				for (int i = 1; i <= columnNum; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}

			} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
