package com.tutorialacademy.rest;

import java.io.IOException;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import kx.c;
import kx.c.KException;

@Path("/")
public class RESTfulHelloWorld {
	
	@GET
	@Path("/start")
	@Produces("text/html")
	public Response getStartingPage() {
		String output = "<h1>Hello World!<h1>" + "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString()+ "</p<br>";
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/test")
	@Produces("application/json")
	public Response getJSONPage() throws KException, IOException {
		String output = "<h1>Test<h1>" + "<p>RESTful Service is running ... <br>Ping @ " + new Date().toString()+ "</p<br>";
		c c= new c("localhost",33357);
		Object result=c.k("2+3");
		System.out.println(result);
		return (Response) result;
	}
	

    @GET
    @Path("/query/{artist_id}")
    @Produces("application/json")
    public Data getMsg(@PathParam("artist_id") int artist_id, @QueryParam("from") int from, @QueryParam("to") int to) {
        Data d=new Data();
        d.setName("Mateen");
        d.setRoll(77);
        return d;
    }
}
