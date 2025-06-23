package servlet_listener;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// here we create the ServletContext for get the connection
		ServletContext context = getServletContext();
		
		// here get the connection here 
		Connection connection =  (Connection)context.getAttribute("oracle");
		
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue><center>");
		printwriter.println("<h1> <u>Established Connection</u></h1>");
		printwriter.println("</center></body></html>");
	}
}
