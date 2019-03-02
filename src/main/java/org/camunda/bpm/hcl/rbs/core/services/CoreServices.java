package org.camunda.bpm.hcl.rbs.core.services;

import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.camunda.bpm.hcl.rbs.repository.BreachDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoreServices {
	@Autowired
	BreachDataRepository breachDataRepository;
	@Transactional
	public void persistBreachData(BreachData breachData) {
		breachDataRepository.save(breachData);
	}

}
