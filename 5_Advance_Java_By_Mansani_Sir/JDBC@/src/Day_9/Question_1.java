package Day_9;

import java.sql.*;

//Program create a table by using execute() method suitable for DDL Query only

public class Question_1 {
	public static void main(String[] args) throws SQLException {

		try {
//			Loading Specific JDBC Driver
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Connection Established here b/w Application and DataBase
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "MYDB11AM", "123");
			System.err.println("Connection is Established");
//			Statement Interface -> It is execute Static SQl Query only
			Statement st = con.createStatement();
			
//			execute() method for only DDL Query -> Data Definition Language Query
			boolean data = st.execute("create table students (ROLLNO number(30), NAME varchar2(10), MARKS number(30))");
			
//			Conditional Operator/Ternary Operator
			if(data) 
					System.out.println("Table is not created");
			else
				System.out.println("table is created");
		}
		catch (ClassNotFoundException e) {
			System.err.println("Connection is not Established");
		}
		catch(SQLSyntaxErrorException e) {
			System.out.println("Student Table is allready available there cannot create more");
		}
	}
	
}
