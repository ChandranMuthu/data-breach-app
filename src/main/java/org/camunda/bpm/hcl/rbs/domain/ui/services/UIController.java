package org.camunda.bpm.hcl.rbs.domain.ui.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {
@RequestMapping("/franchises")
public ResponseEntity<List<String>> getFranchises(){
	List<String> franchises = new ArrayList<>();
	franchises.addAll(Arrays.asList("Private Banking","RBSI","Services"));
	return new ResponseEntity<>(franchises, HttpStatus.OK);
}
@RequestMapping("/business-area/{franchise}")
public ResponseEntity<List<String>> getBusinessAreas(@PathVariable("franchise") String franchise){
	List<String> businessAreas = new ArrayList<>();
	if("Private Banking".equals(franchise)) {
		businessAreas.addAll(Arrays.asList("Business Banking","Specialist Banking","Customer Experience","Branch & Premier"));
	}else if("RBSI".equals(franchise)) {
		businessAreas.addAll(Arrays.asList("Executive Office","Customer Experience","Personal and Business Banking","Risk","Finance","Transformation"));
	}else if("Services".equals(franchise)){
		businessAreas.addAll(Arrays.asList("Payments","Shared Services","CIO Teche","Innovation & Solutions"));
	}
	return new ResponseEntity<>(businessAreas, HttpStatus.OK);
}
@RequestMapping("/breach-identifiers")
public ResponseEntity<List<String>> getBreachIdentifier(){
	List<String> franchises = new ArrayList<>();
	franchises.add("I identified the breach");
	franchises.add("A colleague identified the breach");
	franchises.add("A company reported it");	
	return new ResponseEntity<>(franchises, HttpStatus.OK);
}
}
