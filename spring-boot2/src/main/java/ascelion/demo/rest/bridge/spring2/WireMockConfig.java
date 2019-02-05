
package ascelion.demo.rest.bridge.spring2;

import ascelion.demo.rest.bridge.spring.WireMockFactory;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WireMockConfig
{

	@Bean
	@Primary
	static public WireMockServer server()
	{
		return WireMockFactory.newServer();
	}

	@Bean( "server1" )
	static public WireMockServer server1()
	{
		return WireMockFactory.newServer();
	}

	@Bean( "server2" )
	static public WireMockServer server2()
	{
		return WireMockFactory.newServer();
	}

}
