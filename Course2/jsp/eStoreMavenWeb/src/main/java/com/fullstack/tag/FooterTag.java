package com.fullstack.tag;

import java.io.IOException;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class FooterTag extends SimpleTagSupport {
	
	@Override
	public void doTag() throws IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<hr /><center>Copyright 2024</center>");
		
	}

}
