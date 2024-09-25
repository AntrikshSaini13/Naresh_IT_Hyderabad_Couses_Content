package Day_19_RowSet;

import java.io.*;
import java.sql.*;
import javax.sql.RowSet.*;

import oracle.jdbc.rowset.*;

public class Question_3_WebRowSet {
	public static void main(String[] args) throws FileNotFoundException {
		// Instance final Variable
		final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
		final String USER_NAME = "MYDB11AM";
		final String PASSWARD = "123";		
		
			try {
				OracleWebRowSet wrs = new OracleWebRowSet();
				wrs.setUrl(URL);
				wrs.setUsername(USER_NAME);
				wrs.setPassword(PASSWARD);
				wrs.setCommand("Select * from Students");
				wrs.execute();
				wrs.writeXml(new FileOutputStream("Students.xml"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
	}
}
