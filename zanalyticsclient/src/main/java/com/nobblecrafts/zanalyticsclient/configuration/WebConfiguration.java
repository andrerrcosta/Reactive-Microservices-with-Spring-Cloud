package com.nobblecrafts.zanalyticsclient.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebConfiguration implements WebFluxConfigurer {
    // @Override
    // public void addCorsMappings(CorsRegistry corsRegistry) {
    //     corsRegistry.addMapping("/**")
    //         .allowedOrigins("http://localhost:4200")
    //         .allowedMethods("PUT", "POST", "DELETE", "GET");
    // }
}
