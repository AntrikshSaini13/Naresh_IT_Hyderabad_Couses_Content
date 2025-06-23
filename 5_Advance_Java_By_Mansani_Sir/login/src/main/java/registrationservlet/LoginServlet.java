package registrationservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connection;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String USER_NAME = "mydb11am";
	private static final String PASSWORD = "123";

	/**
	 * @see GenericServlet#GenericServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			
			String username = request.getParameter("username");// this parameter comes form login.html file name = username store in String username
			String password = request.getParameter("password");// this parameter comes from login.html file name = password
			
			//
			PreparedStatement preparedstatement = connection.prepareStatement("select * from registration where username = ? and password = ?");
			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);
			ResultSet resultset = preparedstatement.executeQuery();
			ResultSetMetaData resultset_metadeta = resultset.getMetaData();
			int count = resultset_metadeta.getColumnCount();
			PrintWriter printwriter = response.getWriter();
			printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
			//			
			if(resultset.next()) {	
				printwriter.println("welcome<br>");
				for(int i = 1; i<=count; i++) {
					printwriter.println(resultset_metadeta.getColumnName(i).toLowerCase());
				}
				printwriter.println("<br>");
				for(int i = 1; i<=count; i++) {
					printwriter.println(resultset.getString(i));
				}				
				printwriter.println("<br>");				
			}
			else {				
				printwriter.println("invalid User name and Password<br>");
			}
			printwriter.println("</h1></center></body></html>");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
