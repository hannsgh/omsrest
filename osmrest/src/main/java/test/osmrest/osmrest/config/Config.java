package test.osmrest.osmrest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import test.osmrest.osmrest.client.OsmClient;
import test.osmrest.osmrest.client.OsmClientImpl;


@Configuration
@RequiredArgsConstructor
public class Config {

    @Value("${oms.url}")
    private String url;

    @Bean
    public OsmClient osmClient() {
        return new OsmClientImpl(url, new RestTemplate());
    }


}
