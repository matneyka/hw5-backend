package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("[LOG] - Request sent to LogoutServlet.doGet()");
		
		if(req.getSession(false) == null) {
			// resp.sendRedirect("index.html"); // From P1 where site was on Tomcat
			return;
		}
		
		HttpSession session = req.getSession(false);
		session.invalidate();  // Should unbind attribute: user
		
		// System.out.println("[LOG] - Session invalidated!");
		// resp.sendRedirect("index.html");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("[LOG] - Request sent to LogoutServlet.doPost().");
		// System.out.println("[LOG] - Redirecting to LogoutServlet.doGet()");
		
		doGet(req,resp);
	}
}
