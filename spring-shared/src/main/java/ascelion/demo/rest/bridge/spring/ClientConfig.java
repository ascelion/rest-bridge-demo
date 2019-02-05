
package ascelion.demo.rest.bridge.spring;

import javax.ws.rs.client.ClientBuilder;

import ascelion.utils.jaxrs.RestClientTrace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig
{

	@Bean
	static public ClientBuilder clientBuilder()
	{
		return ClientBuilder.newBuilder()
			.register( RestClientTrace.class, Integer.MAX_VALUE );
	}

}
