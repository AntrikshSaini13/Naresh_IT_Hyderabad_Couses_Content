package Day_12;

import java.sql.*;

//This program to Insert data in table in Database

public class Question_2_InsertDataTable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MYDB11AM", "123");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO STUDENTS VALUES(180114, 'Anushka Sharam', 500)");
			System.out.println("Insert the data of student");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
