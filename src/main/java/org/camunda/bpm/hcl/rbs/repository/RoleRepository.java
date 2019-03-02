package org.camunda.bpm.hcl.rbs.repository;

import org.camunda.bpm.hcl.rbs.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>  {

}
