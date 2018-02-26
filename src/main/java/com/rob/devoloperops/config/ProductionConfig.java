package com.rob.devoloperops.config;


import com.rob.devoloperops.service.EmailService;
import com.rob.devoloperops.service.SmtpEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/developerops/application-prod.properties")
public class ProductionConfig {




    @Bean
    public EmailService emailService(){


        return new SmtpEmailService();
    }
}
