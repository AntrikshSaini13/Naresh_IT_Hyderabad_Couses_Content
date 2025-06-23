package url_Rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetURLRewritingOnServlet
 */
public class SetURLRewritingOnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetURLRewritingOnServlet() {
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
		printwriter.println("<html><body bgcolor = yellow text = blue><center>");
		printwriter.println("<h1> <u>Added On Servlet Book</u></h1>");
		// appended url Rewriting
		printwriter.println("<a href=get?book1="+book1+"&book2="+book2+"&book3="+book3+">Next</a>");
		printwriter.println("</center></body></html>");
	}
//http://localhost:8082/Day_35_URLRewriting/set?book1=JavaSE&book2=JavaEE&book3=JavaFX
}
