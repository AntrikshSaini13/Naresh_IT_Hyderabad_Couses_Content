package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = session.getId();
		long creactionTime = session.getCreationTime();
		long lastAccessed = session.getLastAccessedTime();
		int inactiveInterval = session.getMaxInactiveInterval();
		
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue> <center>");
		printwriter.println("<h1> <u>Session Tracking</u></h1>");
		printwriter.println("Session Id : "+id+"<br>");
		printwriter.println("Creation Time : "+new Date(creactionTime)+"<br");
		printwriter.println("Last Accessed Time : "+new Date(lastAccessed)+"<br>");
		printwriter.println("Time interval : "+inactiveInterval+" second<br>");
		printwriter.println("</center></body></html>");
	}

}
