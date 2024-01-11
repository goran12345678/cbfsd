package com.estore.filters;

import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet Filter implementation class ValidateFilter
 */
public class ValidateFilter extends HttpFilter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("[Filter] destroy called");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String email = request.getParameter("email");
		
		//pre-processing
		out.print("<center>");
		
		if (!email.contains("@")) {
			out.print("<b>Email not formatted properly!!</b>");
			
		} else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}

		//post-processing
		out.print("<br /><b>Thank you for registering!!</b>");
		out.print("</center>");
		
		System.out.println("[Filter] doFilter called");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("[Filter] init called");
	}

}
