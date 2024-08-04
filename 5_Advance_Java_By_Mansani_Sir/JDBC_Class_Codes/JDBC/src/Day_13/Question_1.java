package Day_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Program for Dynamic Query which is used to insert the data use only DML Query only

public class Question_1 {
	
	int roll;
	String name;
	int marks;
	
	public Question_1(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void update() throws SQLException {

		try {
//			Loading The Specific Driver
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MyDB11AM", "123");
			System.out.println("Connection Establish Succecfully");
			
//			PreparedStatement Interface used for dynamic Query method is perparedSatement()
			PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTS VALUES(?, ?, ?)");
			
//			Set the data index because of array index start 0,1,.. and database index column number star from 1,2,..
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
//			This method of DQL Query purpose only
			ps.executeUpdate();
			
			System.out.println("One Record Updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
