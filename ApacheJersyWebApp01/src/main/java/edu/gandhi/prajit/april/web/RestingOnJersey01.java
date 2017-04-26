package edu.gandhi.prajit.april.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("RestingOnJersey01")
public class RestingOnJersey01 {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextPlainForRestingOnJersey01() {
		return "Do You Know How To Make Wow Pomphret?";
	}
}
