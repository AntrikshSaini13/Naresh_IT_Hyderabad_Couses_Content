package Day_27_Image;

import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class Image
 */
public class Image extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Image() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try (FileInputStream fis = new FileInputStream("E:\\7-NareshiT_Hyd_Record_Of_Class gitHub\\5_Advance_Java_By_Mansani_Sir\\ServletProgramming\\src\\main\\java\\Day_27_Image\\IMG_4631.jpg")) {
			int n = fis.available();//it return file size
			byte [] b = new byte[n];//it allocate the memory in ram according to file size
			
			fis.read(b);// it will read data form file
			
			ServletOutputStream sos = response.getOutputStream(); // It create a stream from server to browser 
			sos.write(b);//It will send  to browser 
		}
	}

}
