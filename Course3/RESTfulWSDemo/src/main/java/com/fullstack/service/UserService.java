package com.fullstack.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class UserService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String registerUserWithPlainResponse() {
		String response = "[PLAIN TEXTS] User REgistered Siuccessfully";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String registerUserWithHTMLReponse() {
		String response = "<html>"
						 	+ "<body>"
						 	+"<h3>[HTML TEXT] User REgisted Successfully</h3>"
						 	+"</body"
						 	+ "</html>";
		return response;
	}
	@GET
	@Produces(MediaType.TEXT_XML)
	public String registerUserWithXMLResponse() {
		String response = "<?xml version='1.0' charset='UTF-8'?>"
							+ "<response>[XML TEXT] User Registered Successfully</response>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String registerUserWithJSONResponse() {
		String response = "{"
							+ "'response':'[JSON TEXT] User Registered Successfully'"
							+ "}";
		return response;
	}

}
