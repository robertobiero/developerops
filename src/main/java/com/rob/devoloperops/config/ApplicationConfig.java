package com.rob.devoloperops.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = "com.rob.devoloperops.backend.persistence.repositories")
@EntityScan(basePackages = "com.rob.devoloperops.backend.persistence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
}
