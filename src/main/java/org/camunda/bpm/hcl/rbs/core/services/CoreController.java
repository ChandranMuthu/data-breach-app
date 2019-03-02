package org.camunda.bpm.hcl.rbs.core.services;

import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {
	
	@Autowired
	CoreServices coreServices;
	
	@RequestMapping(value = "/breach-infos", method = RequestMethod.POST)
    public ResponseEntity<String> persistBreachData(@RequestBody BreachData breachData) {
		coreServices.persistBreachData(breachData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
