package org.camunda.bpm.hcl.rbs.core.services;

import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoreServices {
	@Autowired
	CoreRepository coreRepository;
	public void persistBreachData(BreachData breachData) {
		
	}

}
