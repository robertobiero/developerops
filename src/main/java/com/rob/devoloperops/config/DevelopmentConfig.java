package com.rob.devoloperops.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.developerops/application-dev.properties")
public class DevelopmentConfig {
}
