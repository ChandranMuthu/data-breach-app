package org.camunda.bpm.hcl.rbs.repository;

import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreachDataRepository extends JpaRepository<BreachData, Long>  {

}
