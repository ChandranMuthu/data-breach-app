package org.camunda.bpm.hcl.rbs.repository;

import org.camunda.bpm.hcl.rbs.domain.BreachLocator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreachLocatorRepository extends JpaRepository<BreachLocator, Long>  {

}
