package test.osmrest.osmrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class OsmrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsmrestApplication.class, args);
	}

}
