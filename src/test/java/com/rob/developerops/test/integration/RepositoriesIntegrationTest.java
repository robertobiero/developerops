package com.rob.developerops.test.integration;


import com.rob.devoloperops.DeveloperopsApplication;
import com.rob.devoloperops.backend.persistence.domain.backend.Plan;
import com.rob.devoloperops.backend.persistence.repositories.PlanRepository;
import com.rob.devoloperops.backend.persistence.repositories.RoleRepository;
import com.rob.devoloperops.backend.persistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DeveloperopsApplication.class)
public class RepositoriesIntegrationTest {


    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    private static final int BASIC_PLAN_ID = 1;
    private static final long BASIC_ROLE_ID = 1;
     private Integer basicplan = 2;

    @Before
    public void init() {

        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);
    }

    @Test
    public void testCreateNewPlan() {


    Plan basicPlan = createBasicPlan();
    planRepository.save(basicPlan);

    Plan retrievedPlan = planRepository.findOne(basicplan);
    Assert.assertNotNull(retrievedPlan);

}

     private Plan createBasicPlan(){

        Plan plan = new Plan();
        plan.setId(BASIC_PLAN_ID);
        plan.setName("Basic");

        return plan;
     }



}
