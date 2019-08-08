package com.pizza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h2>Pizza Party</h2>\r\n" + 
				"");
		if (request.getParameter("isError") != null) {
			out.println("Please login first");
		}
		out.println("<form action=\"home\">\r\n" + 
				"  Username:<br>\r\n" + 
				"  <input type=\"text\" name=\"username\">\r\n" + 
				"  <br>\r\n" + 
				"  Password:<br>\r\n" + 
				"  <input type=\"text\" name=\"password\">\r\n" + 
				"  <br><br>\r\n" + 
				"  Full Name:<br>\r\n" + 
				"  <input type=\"text\" name=\"name\">\r\n" + 
				"  <br><br>\r\n" + 
				"  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"</form> \r\n" + 
				"</body>\r\n" + 
				"</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//TODO check user name and password
		// OrderDao.checkUser(request.getParameter(username, password)
		if (1 == 2) {
			// redirect to order page
			ServletContext context= getServletContext();
			RequestDispatcher rd= context.getRequestDispatcher("order"
					+ ""
					+ "");
			rd.forward(request, response);
		} else {
			// print out error message
			// forward back to self
			PrintWriter out = response.getWriter();
			request.setAttribute("isError", true);
			doGet(request, response);
		}
		
	}

}
