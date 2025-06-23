package registration_pages;

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

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connection;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ServletContext servlet_context = config.getServletContext();
		try {
			Class.forName(servlet_context.getInitParameter("driver"));
			connection = DriverManager.getConnection(servlet_context.getInitParameter("url"),servlet_context.getInitParameter("username"),servlet_context.getInitParameter("password"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			PreparedStatement preparedstatement = connection.prepareStatement("select * from registration where username = ? and password = ?");
			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);
			ResultSet resultset = preparedstatement.executeQuery();
			
			PrintWriter printwriter = response.getWriter();			
					
			if(resultset.next()) {
				RequestDispatcher request_dispatcher =  request.getRequestDispatcher("/welcome");
				request_dispatcher.forward(request, response);
			}
			else {
				printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
				printwriter.println("invalid username<br>"+username);
				printwriter.println("</h1></center></body></html>");
				RequestDispatcher request_dispatcher =  request.getRequestDispatcher("/loginPages.html");
				request_dispatcher.include(request, response);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
