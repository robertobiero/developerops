package com.rob.devoloperops.backend.persistence.repositories;

import com.rob.devoloperops.backend.persistence.domain.backend.Plan;
import com.rob.devoloperops.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanRepository extends CrudRepository<Plan, Long> {
}
