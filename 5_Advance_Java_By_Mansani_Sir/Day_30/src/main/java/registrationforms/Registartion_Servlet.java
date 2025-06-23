package registrationforms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class Registartion_Form
 */
public class Registartion_Servlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;  
//    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
//	private static final String USERNAME = "Mydb11am";
//	private static final String PASSWORD = "123";
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Registartion_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		try {
			ServletContext servletcontext = config.getServletContext();
			String driver = servletcontext.getInitParameter("driver");
			String url = servletcontext.getInitParameter("url");
			String username = servletcontext.getInitParameter("username");
			String password = servletcontext.getInitParameter("password");
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			
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
			
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String phonenumber = request.getParameter("phonenumber");
			String username = request.getParameter("username");
			String password = request.getParameter("password");			
		
			PreparedStatement preparedstatement = connection.prepareStatement("insert into registration values(?,?,?,?,?)");
			preparedstatement.setString(1, firstname);
			preparedstatement.setString(2, lastname);
			preparedstatement.setString(3, phonenumber);
			preparedstatement.setString(4, username);
			preparedstatement.setString(5, password);
			preparedstatement.executeUpdate();
			
			PrintWriter printwriter = response.getWriter();
			printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
			printwriter.println("Registration Succesfully");
			printwriter.println("</h1></center></body></html>");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
