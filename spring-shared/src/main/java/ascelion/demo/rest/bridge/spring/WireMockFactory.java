
package ascelion.demo.rest.bridge.spring;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static javax.ws.rs.core.HttpHeaders.CONTENT_TYPE;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import com.github.tomakehurst.wiremock.WireMockServer;

public final class WireMockFactory
{

	static public WireMockServer newServer()
	{
		final WireMockServer wms = new WireMockServer( 0 );

		wms.start();

		configureFor( wms.port() );
		stubFor( get( "/hello" )
			.willReturn( aResponse()
				.withHeader( CONTENT_TYPE, TEXT_PLAIN )
				.withBody( Constants.GREETINGS ) ) );

		return wms;
	}

	private WireMockFactory()
	{
	}
}
