
package ascelion.demo.rest.bridge.spring2;

import java.net.URL;

import static ascelion.demo.rest.bridge.spring.Constants.GREETINGS;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith( SpringRunner.class )
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class HelloControllerIT
{

	@LocalServerPort
	private int port;
	private URL base;

	@Autowired
	private TestRestTemplate template;

	@Before
	public void setUp() throws Exception
	{
		this.base = new URL( "http://localhost:" + this.port + "/" );
	}

	@Test
	public void getHello() throws Exception
	{
		final ResponseEntity<String> response = this.template.getForEntity( this.base.toString(), String.class );

		assertThat( response.getBody(), equalTo( GREETINGS + GREETINGS + GREETINGS + GREETINGS ) );
	}
}