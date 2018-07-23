package com.revature.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestViewHelper {
	public String process(HttpServletRequest req, HttpServletResponse reps) {
		// System.out.println("[LOG] - Processing request with RequestViewHelper.process()");
		
		switch(req.getRequestURI()) {
		case "/login.view":
			return "partials/login.html";
		case "/register.view":
			return "partials/register.html";
		case "/dashboard.view":
			return "partials/dashboard.html";
		case "/addrequest.view":
			return "partials/addrequest.html";
		case "/request.view":
			return "partials/request.html";
		default:
			return null;
		}
	}
}
