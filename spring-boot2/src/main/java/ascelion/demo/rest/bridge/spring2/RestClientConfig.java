
package ascelion.demo.rest.bridge.spring2;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;

import ascelion.rest.bridge.client.RestClient;

import static ascelion.rest.bridge.client.RestClient.newRestClient;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RestClientConfig
{

	@Bean
	@Primary
	static public RestClient restClient( ClientBuilder bld, WireMockServer wms )
	{
		return newRestClient( bld.build(), URI.create( wms.baseUrl() ) );
	}

	@Bean( "client1" )
	static public RestClient restClient1( ClientBuilder bld, @Qualifier( "server1" ) WireMockServer wms )
	{
		return newRestClient( bld.build(), URI.create( wms.baseUrl() ) );
	}

	@Bean( "client2" )
	static public RestClient restClient2( ClientBuilder bld, @Qualifier( "server2" ) WireMockServer wms )
	{
		return newRestClient( bld.build(), URI.create( wms.baseUrl() ) );
	}

}
