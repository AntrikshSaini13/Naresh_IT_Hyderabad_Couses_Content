package Day_26_Table;

import java.io.*;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class TableOfFive
 */
public class TableOfFive extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TableOfFive() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow>");
		pw.println("<table border=12>");
		for(int i = 1 ; i<=100; i++) {
			pw.println("<tr><td>5</td>");
			pw.println("<td>X</td>");
			pw.println("<td>"+i+"</td");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td></tr>");
		}
		pw.println("</table></body></html>");
	}
}
