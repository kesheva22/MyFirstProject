package com.NewWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")

public class NewWebProjectServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	
		// two numbers
		int i = Integer.parseInt(req.getParameter("number 1"));
		int j = Integer.parseInt(req.getParameter("number 2"));
		Integer n = 0;

		PrintWriter ou = resp.getWriter();
		
		//
		String s = req.getParameter("adder");
		String s1 = req.getParameter("sub");
		String s3 = req.getParameter("mul");
		String s4 = req.getParameter("div");
		if (s != null) {

			n = j + i;
		}
		if (s1 != null) {
			n = i - j;
		}
		if (s3 != null) {
			n = i * j;
		}
		if (s4 != null) {
			n = i / j;
		}

		resp.setContentType("text/html");
		ou.write("<input type=\"text\" name=\"number 3\"placeholder=\"");
		ou.append(n.toString());
		ou.append("\">");
		ou.println("asdasd");
		try {
			req.getRequestDispatcher("index.html").include(req, resp);
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ou.println(i+j);
	}

}
