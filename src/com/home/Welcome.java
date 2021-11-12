package com.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class Welcome extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		
		resp.getWriter().println("<html>"
				+ "<head>"
				+ "<title>My Page</title>"
				+ "</head>"
				+ "<body>"
				+ "<h2> welcome, the current time is "+req.getParameter("nameInput")+"  "
						+req.getParameter("ageInput") +"-"+ Thread.currentThread().getName()+ "</h2> "
				+ "</body>"
				+ "</html>");
		
		
	}

}
