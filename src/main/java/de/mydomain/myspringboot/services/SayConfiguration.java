package de.mydomain.myspringboot.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SayConfiguration {
    @Bean
    public SayConfigurableService  sayConfigurableService() {
        SayConfigurableService sayConfigurableService = new SayConfigurableService();
        sayConfigurableService.setToSay("Hello World Configurable...");
        return sayConfigurableService;
    }
}
