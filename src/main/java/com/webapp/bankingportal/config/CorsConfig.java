package com.webapp.bankingportal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        
        
    registry.addMapping("/**")
    .allowedOrigins("https://bang-ui-prod-winnerrs-mani-dev.apps.rm1.0a51.p1.openshiftapps.com")// Should be configurable
    .allowedMethods("GET", "POST", "PUT", "DELETE");

        // Below should be changed for produciton
        // registry.addMapping("/**")
        //         .allowedOrigins("*")
        //         .allowedMethods("*");
    }
}
