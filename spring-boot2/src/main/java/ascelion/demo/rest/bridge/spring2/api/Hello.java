
package ascelion.demo.rest.bridge.spring2.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path( "hello" )
public interface Hello
{

	@GET
	@Produces( TEXT_PLAIN )
	String say();
}
