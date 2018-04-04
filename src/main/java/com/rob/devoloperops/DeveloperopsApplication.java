package com.rob.devoloperops;

import com.rob.devoloperops.backend.persistence.domain.backend.Role;
import com.rob.devoloperops.backend.persistence.domain.backend.User;
import com.rob.devoloperops.backend.persistence.domain.backend.UserRole;
import com.rob.devoloperops.enums.PlansEnum;
import com.rob.devoloperops.enums.RolesEnum;
import com.rob.devoloperops.service.UserService;
import com.rob.devoloperops.utils.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableOAuth2Sso
public class DeveloperopsApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DeveloperopsApplication.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
         		SpringApplication.run(DeveloperopsApplication.class, args);
	}

	@Value("${webmaster.password}")
	private String webmasterPassword;

	@Value("${webmaster.username}")
	private String webmasterUsername;

	@Value("${webmaster.email}")
	private String webmasterEmail;

	@Override
	public void run(String... args){
		String username = "proUser";
		String email = "prouser@devops.com";
		User user = UserUtils.createBasicUser(webmasterUsername,webmasterEmail);
		user.setPassword(webmasterPassword);
		Set<UserRole> userRoles = new HashSet<>();

		userRoles.add(new UserRole(user, new Role(RolesEnum.BASIC)));
		LOG.debug("creating user", user.getUsername());

		userService.createUser(user, PlansEnum.PRO,userRoles);

	}

	
}
