package com.tutorialacademy.rest;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/") //annotation specifies that the Java class will be hosted at the URI path /helloworld. 
public class RESTfulHelloWorld {
	@GET
	@Produces("text/html") // annotation specifies that the Java method will produce content identified by the MIME media type text/plain. 
	public Response getStartingPage() {
		String output = "<h1>Hello World!<h1>" + "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString()
				+ "</p<br>";
		return Response.status(200).entity(output).build();
	}
}