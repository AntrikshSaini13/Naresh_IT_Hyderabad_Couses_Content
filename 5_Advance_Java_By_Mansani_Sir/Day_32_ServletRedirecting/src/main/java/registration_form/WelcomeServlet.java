package registration_form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public WelcomeServlet() {
        super();
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		String username = request.getParameter("username");
		PrintWriter printwriter = response.getWriter();
		LoginServlets loginservlets = new LoginServlets();
		printwriter.println("<html><body bgcolor = yellow text = blue><center><h1>");
		printwriter.println("Welcome"+loginservlets.getUsername());
		printwriter.println("</h1></center></body></html>");
	}

}
