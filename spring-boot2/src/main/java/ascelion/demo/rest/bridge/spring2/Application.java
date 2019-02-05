
package ascelion.demo.rest.bridge.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( "ascelion.demo.rest.bridge" )
public class Application
{

	public static void main( String[] args )
	{
		SpringApplication.run( Application.class, args );
	}

}
