package org.camunda.bpm.hcl.rbs.repository;

import org.camunda.bpm.hcl.rbs.domain.BreachInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreachInfoRepository extends JpaRepository<BreachInfo, Long>  {

}
