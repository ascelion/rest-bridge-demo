
package ascelion.demo.rest.bridge.spring1;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;

import ascelion.demo.rest.bridge.spring.WireMockFactory;
import ascelion.rest.bridge.client.RestClient;

import static ascelion.rest.bridge.client.RestClient.newRestClient;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application
{

	public static void main( String[] args )
	{
		SpringApplication.run( Application.class, args );
	}

	@Bean
	static public WireMockServer server()
	{
		return WireMockFactory.newServer();
	}

	@Bean
	static public RestClient restClient( ClientBuilder bld, WireMockServer wms )
	{
		return newRestClient( bld.build(), URI.create( wms.baseUrl() ) );
	}

}
