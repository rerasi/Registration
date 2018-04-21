package rr.reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fname,lname,email,day,month,year,radio,phone,address;
		
		fname = request.getParameter("fname");
		lname = request.getParameter("lname");
		email = request.getParameter("email");
		day = request.getParameter("day");
		month = request.getParameter("month");
		year = request.getParameter("year");
		radio = request.getParameter("radio");
		phone = request.getParameter("phone");
		address = request.getParameter("address");
		
		PrintWriter out = response.getWriter();
		
		out.println("Name: " +fname+ " " +lname);
		out.println("Email: " +email);
		out.println("Birthday: " +day+ "-" +month+ "-" +year);
		if("1".equals(radio))
		{
			out.println("Gender: Male ");
		}
		else 
		{
			out.println("Gender: Female ");
		}
		out.println("Phone: " +phone);
		out.println("Address: " +address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
