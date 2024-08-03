package Day_14;

import java.sql.*;

//this is a program of PL/SQL Query 

public class Question_1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MYDB11AM", "123");
			
//		CallableStatement Interface used for PL/SQL Query method is perpareCall()		
			CallableStatement cs = con.prepareCall("{CALL INSERTPRO(?, ?, ?)}");

//		Set the data index because of array index start 0,1,.. and database index column number star from 1,2,..
			cs.setInt(1, Integer.parseInt(args[0]));
			cs.setString(2,args[1]);
			cs.setInt(3, Integer.parseInt(args[2]));
			
//		This method of DML Query purpose only
			cs.executeUpdate();
			System.out.println("Insert the data in table");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
