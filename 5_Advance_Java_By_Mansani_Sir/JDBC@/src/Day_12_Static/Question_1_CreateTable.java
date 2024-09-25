package Day_12_Static;

// This program to create table in Database statically
import java.sql.*;

public class Question_1_CreateTable{
	public void tableCreate()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "MYDB11AM", "123");
			Statement st = con.createStatement();
			st.execute("CREATE TABLE  STUDENTS(ROLL_NO number(10), STD_NAME varchar2(20), STD_MARKS number(10))");
			System.out.println("Create Table in Database");
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}		
	}
}
