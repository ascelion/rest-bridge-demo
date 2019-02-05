
package ascelion.demo.rest.bridge.spring2;

import ascelion.demo.rest.bridge.spring.Constants;
import ascelion.demo.rest.bridge.spring2.api.Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

	@Autowired
	private Hello hello;
	@Autowired
	@Qualifier( "client1" )
	private Hello hello1;
	@Autowired
	@Qualifier( "client2" )
	private Hello hello2;

	@RequestMapping( "/" )
	public String index()
	{
		return Constants.GREETINGS
			+ this.hello.say()
			+ this.hello1.say()
			+ this.hello2.say();
	}
}
