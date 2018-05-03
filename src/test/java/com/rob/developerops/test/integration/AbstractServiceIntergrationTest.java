package com.rob.developerops.test.integration;

import com.rob.devoloperops.backend.persistence.domain.backend.Role;
import com.rob.devoloperops.backend.persistence.domain.backend.User;
import com.rob.devoloperops.backend.persistence.domain.backend.UserRole;
import com.rob.devoloperops.enums.PlansEnum;
import com.rob.devoloperops.enums.RolesEnum;
import com.rob.devoloperops.service.UserService;
import com.rob.devoloperops.utils.UserUtils;
import org.junit.rules.TestName;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class AbstractServiceIntergrationTest {

    @Autowired
    protected UserService userService;

    protected User createUser(TestName testName) {
        String username = testName.getMethodName();
        String email = testName.getMethodName() + "@devopsbuddy.com";

        Set<UserRole> userRoles = new HashSet<>();
        User basicUser = UserUtils.createBasicUser(username, email);
        userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));

        return userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
    }
}
