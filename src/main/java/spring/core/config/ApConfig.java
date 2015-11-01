package spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApConfig {
	
	@Bean(name="helloWorld")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}

}
