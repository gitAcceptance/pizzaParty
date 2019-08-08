package com.pizza;

import java.io.IOException;
import java.io.PrintWriter;

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
		out.println("<html>");
		if (request.getParameter("isError") != null) {
			out.println("Please login first");
		}
		out.println("<h2>Login to your account</h2>\r\n" + 
				"        <form id=\"login\" action=\"home\" method=\"POST\">\r\n" + 
				"          <input type=\"text\" name=\"username\" placeholder=\"username\" />\r\n" + 
				"          <input type=\"password\" name=\"password\" placeholder=\"password\" />\r\n" + 
				"          <button type=\"submit\" value=\"login\" class=\"btn\">Login</button>\r\n" + 
				"        </form>");
		
		
		
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//TODO check user name and password
		// OrderDao.checkUser(request.getParameter(username, password)
		if (1 == 2) {
			// redirect to order page
		} else {
			// print out error message
			// forward back to self
			PrintWriter out = response.getWriter();
			request.setAttribute("isError", true);
			doGet(request, response);
		}
		
	}

}
