package org.camunda.bpm.hcl.rbs.core.services;

import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.camunda.bpm.hcl.rbs.request.BreachDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {
	
	@Autowired
	CoreServices coreServices;
	
	@PostMapping(value = "/breach-infos")
    public ResponseEntity<String> persistBreachData(@RequestBody BreachDataVO breachData) {
		coreServices.persistBreachData(breachData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
