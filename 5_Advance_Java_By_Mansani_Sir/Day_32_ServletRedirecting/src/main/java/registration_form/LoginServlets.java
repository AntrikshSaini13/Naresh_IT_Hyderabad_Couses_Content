package registration_form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlets
 */
public class LoginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;
    private String username;
    private String password;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlets() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public String getUsername() {    	
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			ServletContext servletcontext = config.getServletContext();
			Class.forName(servletcontext.getInitParameter("driver"));
			connection = DriverManager.getConnection(servletcontext.getInitParameter("url"), servletcontext.getInitParameter("username"), servletcontext.getInitParameter("password"));
		} catch (ClassNotFoundException | SQLException e) {
			e.getMessage();
		}
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			username = request.getParameter("username"); 
			password = request.getParameter("password"); 
			
			PreparedStatement preparestatement = connection.prepareStatement("Select * from registration where username = ? and password = ?");
			preparestatement.setString(1, username);
			preparestatement.setString(2, password);
			
			ResultSet resultset = preparestatement.executeQuery();
			
			PrintWriter printwriter = response.getWriter();
			
			if(resultset.next()) {
				response.sendRedirect("welcome");
			}
			else {
				printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
				printwriter.println("Invalid User and Password");
				printwriter.println("</h1></center></body></html>");
				RequestDispatcher request_dispatcher  = request.getRequestDispatcher("/login.html");
				request_dispatcher.include(request, response);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
