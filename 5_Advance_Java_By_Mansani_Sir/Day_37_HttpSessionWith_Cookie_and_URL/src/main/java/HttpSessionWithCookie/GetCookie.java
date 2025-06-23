package HttpSessionWithCookie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// here we create the object of HttpSession
		HttpSession httpsession = request.getSession();
		// get the data form server side
		String book1 = (String)httpsession.getAttribute("book1");
		String book2 = (String)httpsession.getAttribute("book2");
		String book3 = (String)httpsession.getAttribute("book3");
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue>");
		printwriter.println("<h1> <u>Selected Book</u></h1>");
		if(book1 != null) {
			printwriter.println(book1+"<br>");
		}
		if(book2 != null) {
			printwriter.println(book2+"<br>");
		}
		if(book3 != null) {
			printwriter.println(book3+"<br>");
		}
		printwriter.println("</body></html>");
	}

}
