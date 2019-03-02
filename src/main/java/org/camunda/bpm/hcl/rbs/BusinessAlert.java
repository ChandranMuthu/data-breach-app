package org.camunda.bpm.hcl.rbs;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;


@Component("businessAlert")
public class BusinessAlert implements JavaDelegate{

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		System.out.println("Business Alert Triggered");
	}

}
