
package ascelion.demo.rest.bridge.spring2;

import static ascelion.demo.rest.bridge.spring.Constants.GREETINGS;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith( SpringRunner.class )
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest
{

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception
	{
		this.mvc.perform( MockMvcRequestBuilders.get( "/" ).accept( APPLICATION_JSON ) )
			.andExpect( status().isOk() )
			.andExpect( content().string( equalTo( GREETINGS + GREETINGS + GREETINGS + GREETINGS ) ) );
	}
}
