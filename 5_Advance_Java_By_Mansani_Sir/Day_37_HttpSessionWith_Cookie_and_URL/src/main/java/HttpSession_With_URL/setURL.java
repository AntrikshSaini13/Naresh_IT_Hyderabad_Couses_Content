package HttpSession_With_URL;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class setURL
 */
public class setURL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setURL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// here get the data form  user side form html file
		String book1 = request.getParameter("book1");
		String book2 = request.getParameter("book2");
		String book3 = request.getParameter("book3");
		
		// Create the object of HttpSession Interface
		HttpSession httpsession = request.getSession();
		
		// set the data on server
		httpsession.setAttribute("book1", book1);
		httpsession.setAttribute("book2", book2);
		httpsession.setAttribute("book3", book3);
		
		// here give response on server
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue> <center>");
		printwriter.println("<h1>Add Cart your Books</h1>");
		
		// it is append a session id with url
		String url_append = response.encodeURL("getURL");
		printwriter.println("<a href="+url_append+">Next</a></center></body></html>");		
	}
}
