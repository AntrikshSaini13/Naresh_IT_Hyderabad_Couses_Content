package registrationforms;

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
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class Login_Servlet
 */
public class Login_Servlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Login_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    public void init(ServletConfig config) throws ServletException {
		try {
			// here we create ServletContext it common to all user
			ServletContext servletcontext = config.getServletContext();
			String driver = servletcontext.getInitParameter("driver");
			String url = servletcontext.getInitParameter("url");
			String username = servletcontext.getInitParameter("username");
			String password = servletcontext.getInitParameter("password");
			// here we established the connection  
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
			
			String username = request.getParameter("username");// this parameter comes form login.html file name = username store in String username
			String password = request.getParameter("password");// this parameter comes from login.html file name = password
			
			// here we writes the preapreStatement for sql Query
			PreparedStatement preparedstatement = connection.prepareStatement("select * from registration where username = ? and password = ?");
			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);
			ResultSet resultset = preparedstatement.executeQuery();
			ResultSetMetaData resultset_metadeta = resultset.getMetaData();
			int count = resultset_metadeta.getColumnCount();
			
			// this for response on server
			PrintWriter printwriter = response.getWriter();			
			printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
			printwriter.println("welcome<br>");
			for(int i = 1; i<=count; i++) {
				printwriter.println(resultset_metadeta.getColumnName(i).toLowerCase());
			}
			printwriter.println("welcome<br>");
			while(resultset.next()) {
				for(int i = 1; i<=count; i++) {
					printwriter.println(resultset.getString(i));
				}
				printwriter.println("<br>");
			}
					
			printwriter.println("<br>");
			printwriter.println("</h1></center></body></html>");
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
