package test.osmrest.osmrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import test.osmrest.osmrest.config.Config;

@EnableCaching
@SpringBootApplication
public class OsmrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsmrestApplication.class, args);
	}

}
