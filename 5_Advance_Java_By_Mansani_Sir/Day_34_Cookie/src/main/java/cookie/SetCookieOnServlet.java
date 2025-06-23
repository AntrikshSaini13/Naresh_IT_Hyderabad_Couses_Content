package cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SetCookieOnServlet
 */
public class SetCookieOnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookieOnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String book1 = request.getParameter("book1");
		String book2 = request.getParameter("book2");
		String book3 = request.getParameter("book3");
		
		if(book1 != null) {
			// here we are create the object of Cookie
			Cookie cookie = new Cookie("book1",book1);
			response.addCookie(cookie);
		}
		if(book2 != null) {
			Cookie cookie = new Cookie("book2",book2);
			response.addCookie(cookie);
		}
		if(book3 != null) {
			Cookie cookie = new Cookie("book3",book3);
			response.addCookie(cookie);
		}
		
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue> <center>");
		printwriter.println("Add Cart your Books");
		printwriter.println("<a href = get>Next</a></center></body></html>");
	}
}
