package com.rob.devoloperops.service;


import com.rob.devoloperops.backend.persistence.domain.backend.Plan;
import com.rob.devoloperops.backend.persistence.domain.backend.User;
import com.rob.devoloperops.backend.persistence.domain.backend.UserRole;
import com.rob.devoloperops.backend.persistence.repositories.PlanRepository;
import com.rob.devoloperops.backend.persistence.repositories.RoleRepository;
import com.rob.devoloperops.backend.persistence.repositories.UserRepository;
import com.rob.devoloperops.enums.PlansEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@Transactional(readOnly = true)
public class UserService {


    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @Transactional
    public User createUser(User user, PlansEnum plansEnum, Set<UserRole> userRoles) {


        String encryptedpassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedpassword);

            Plan plan = new Plan(plansEnum);
            // It makes sure the plans exist in the database
            if (!planRepository.exists(plansEnum.getId())) {
                plan = planRepository.save(plan);
            }

            user.setPlan(plan);

            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

          user = userRepository.save(user);
          return user;

        }

        public void updateUserPassword(long userId, String password){

        userRepository.updateUserPassword(userId,password);
        }



    }

