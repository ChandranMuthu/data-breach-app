package org.camunda.bpm.hcl.rbs.core.services;

import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.camunda.bpm.hcl.rbs.domain.BreachData;
import org.camunda.bpm.hcl.rbs.domain.BreachInfo;
import org.camunda.bpm.hcl.rbs.domain.BreachLocator;
import org.camunda.bpm.hcl.rbs.domain.BreachReporter;
import org.camunda.bpm.hcl.rbs.repository.BreachDataRepository;
import org.camunda.bpm.hcl.rbs.repository.BreachInfoRepository;
import org.camunda.bpm.hcl.rbs.repository.BreachLocatorRepository;
import org.camunda.bpm.hcl.rbs.repository.BreachReporterRepository;
import org.camunda.bpm.hcl.rbs.request.BreachDataVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoreServices {
	@Autowired
	BreachDataRepository breachDataRepository;
	@Autowired
	BreachInfoRepository breachInfoRepository;
	@Autowired
	BreachLocatorRepository breachLocatorRepository;
	@Autowired
	BreachReporterRepository breachReporterRepository;
	@Transactional
	public void persistBreachData(BreachDataVO breachDataVO) {
		BreachData breachData = new BreachData();
		breachData.setBreachDataId(RandomUtils.nextLong());
		BeanUtils.copyProperties(breachDataVO, breachData);
		BreachInfo breachInfo = new BreachInfo();
		BreachLocator businessDomain = new BreachLocator();
		BreachReporter breachReporter = new BreachReporter();
		BeanUtils.copyProperties(breachDataVO.getBreachInfo(), breachInfo);
		BeanUtils.copyProperties(breachDataVO.getBusinessDomain(), businessDomain);
		BeanUtils.copyProperties(breachDataVO.getBreachReporter(), breachReporter);
		breachInfo.setBreachInfoId(breachData.getBreachDataId());
		businessDomain.setBreachLocatorId(breachData.getBreachDataId());
		breachReporter.setBreachReporterId(breachData.getBreachDataId());
		/*breachData.setBreachInfo(breachInfo);
		breachData.setBreachReporter(breachReporter);
		breachData.setBusinessDomain(businessDomain);*/
		breachDataRepository.save(breachData);
		breachInfoRepository.save(breachInfo);
		breachLocatorRepository.save(businessDomain);
		breachReporterRepository.save(breachReporter);
	}

}
