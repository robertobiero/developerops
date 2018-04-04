package com.rob.developerops.test.integration;


import com.rob.devoloperops.DeveloperopsApplication;
import com.rob.devoloperops.backend.persistence.domain.backend.Role;
import com.rob.devoloperops.backend.persistence.domain.backend.User;
import com.rob.devoloperops.backend.persistence.domain.backend.UserRole;
import com.rob.devoloperops.enums.PlansEnum;
import com.rob.devoloperops.enums.RolesEnum;
import com.rob.devoloperops.service.UserService;
import com.rob.devoloperops.utils.UserUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DeveloperopsApplication.class)
public class UserServiceIntergrationTest {


    @Autowired
    private UserService userService;

    @Test
    public void testCreateNewUser() throws Exception {

       Set<UserRole> userRoles = new HashSet<>();
       String username = "proUser";
       String email = "email@robert.com";
       User basicUser = UserUtils.createBasicUser(username,email);
       userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));
       User user = userService.createUser(basicUser, PlansEnum.BASIC, userRoles);

    }
}
