package org.camunda.bpm.hcl.rbs.repository;

import org.camunda.bpm.hcl.rbs.domain.BreachReporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreachReporterRepository extends JpaRepository<BreachReporter, Long>  {

}
