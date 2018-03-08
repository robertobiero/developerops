package com.rob.devoloperops.config;


import com.rob.devoloperops.service.EmailService;
import com.rob.devoloperops.service.MockEmailService;
import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.servlet.ServletRegistration;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/developerops/application-dev.properties")
public class DevelopmentConfig {





    @Bean
    public EmailService emailService(){

        return new MockEmailService();
    }


    @Bean
    public ServletRegistrationBean h2ConsoleServletRegistration(){

        ServletRegistrationBean  bean = new ServletRegistrationBean(new WebServlet());
        bean.addUrlMappings("/console/*");

        return bean;
    }
}
