package Day_10;

import java.sql.*;

//Program insert a record by using executeUpdate() method suitable for DMl Query only

public class Question_1 {
	public static void main(String[] args) {

		try {
//			Loading the Specific driver-4
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Connection Established between Application and Database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MYDB11AM", "123");
			System.out.println("Connection Established");
			
//			Statement interface it is used to createStatement() method for Static SQL Query
			Statement statement = con.createStatement();			
			
//			execute method it is suitable for DQL Query
			int num = statement.executeUpdate("INSERT INTO STUDENTS VALUES(180112, 'Antriksh', 800)");
			System.out.println("Insert the data of Students in table");
		} 
		catch (ClassNotFoundException e)  {
			System.out.println("Connection Is not Established");
			System.out.println(e);
		}
		catch (SQLSyntaxErrorException e) {
			System.out.println("Table allready availiable in  Database");
			System.out.println(e);
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	} 
}
