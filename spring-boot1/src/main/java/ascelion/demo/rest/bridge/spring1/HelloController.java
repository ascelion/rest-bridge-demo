
package ascelion.demo.rest.bridge.spring1;

import ascelion.demo.rest.bridge.spring1.api.Hello;

import static ascelion.demo.rest.bridge.spring.Constants.GREETINGS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

	@Autowired
	private Hello hello;

	@RequestMapping( "/" )
	public String index()
	{
		return GREETINGS
			+ this.hello.say();
	}
}
