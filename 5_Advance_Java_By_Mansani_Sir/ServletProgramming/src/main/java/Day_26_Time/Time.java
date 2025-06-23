package Day_26_Time;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class Time
 */
public class Time extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LocalTime lt = LocalTime.now();
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=yellow text=pink align=center><h1>");
		pw.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
		pw.println("</h1></body></html>");
	}

}
