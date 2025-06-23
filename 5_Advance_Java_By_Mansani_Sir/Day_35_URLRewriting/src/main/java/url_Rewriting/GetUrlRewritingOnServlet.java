package url_Rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetUrlRewritingOnServlet
 */
public class GetUrlRewritingOnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUrlRewritingOnServlet() {
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
		
		PrintWriter printwriter = response.getWriter();
		printwriter.println("<html><body bgcolor = yellow text = blue> <center>");
		printwriter.println("<h1> <u>Selected Book</u></h1>");
		
		if(!book1.equals("null")) {
			printwriter.println(book1+"<br>");
		}
		if(!book2.equals("null")) {
			printwriter.println(book2+"<br>");
		}
		if(!book3.equals("null")) {
			printwriter.println(book3+"<br>");
		}
		printwriter.println("</center></body></html> ");
	}
}
