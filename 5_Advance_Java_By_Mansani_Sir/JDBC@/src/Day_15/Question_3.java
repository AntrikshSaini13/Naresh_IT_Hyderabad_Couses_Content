package Day_15;


import java.sql.*;

//Here we use Static Query only using the interface Statement and the method is create()

public class Question_3 implements AutoCloseable{
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","MYDB11AM", "123");
			
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("Select * from Students");
			System.out.println(rs.isBeforeFirst());
			rs.absolute(5);
			ResultSetMetaData rm = rs.getMetaData();
			int countCol = rm.getColumnCount();
			for(int i=1; i<=countCol;i++) {
				System.out.print(rm.getColumnName(countCol)+"\t");
			}
//			rs.relative(-3);
			System.out.println(rs.isFirst());
			System.out.println();
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\t");
			
			rs.relative(-3);
			System.out.println(rs.isFirst());
			System.out.println();
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\t");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close");
		
	}
}
