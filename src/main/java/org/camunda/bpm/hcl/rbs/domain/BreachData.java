package org.camunda.bpm.hcl.rbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="t_breach_data")
public class BreachData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "breach_data_id")
	private Long breachDataId;	
	private String franchise;
	private String businessArea;
	private String breachIdentifier;
	@OneToOne
	@JoinColumn(name="breach_reporter_id")
	private BreachReporter breachReporter;
	@OneToOne
	@JoinColumn(name="breach_info_id")
	private BreachInfo breachInfo;
	@OneToOne
	@JoinColumn(name="business_domain_id")
	private BreachLocator businessDomain;
	private String issueCompromisedEntity;
	
	public Long getBreachDataId() {
		return breachDataId;
	}
	public void setBreachDataId(Long breachDataId) {
		this.breachDataId = breachDataId;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
	public String getBreachIdentifier() {
		return breachIdentifier;
	}
	public void setBreachIdentifier(String breachIdentifier) {
		this.breachIdentifier = breachIdentifier;
	}
	public BreachReporter getBreachReporter() {
		return breachReporter;
	}
	public void setBreachReporter(BreachReporter breachReporter) {
		this.breachReporter = breachReporter;
	}
	public BreachInfo getBreachInfo() {
		return breachInfo;
	}
	public void setBreachInfo(BreachInfo breachInfo) {
		this.breachInfo = breachInfo;
	}
	public BreachLocator getBusinessDomain() {
		return businessDomain;
	}
	public void setBusinessDomain(BreachLocator businessDomain) {
		this.businessDomain = businessDomain;
	}
	public String getIssueCompromisedEntity() {
		return issueCompromisedEntity;
	}
	public void setIssueCompromisedEntity(String issueCompromisedEntity) {
		this.issueCompromisedEntity = issueCompromisedEntity;
	}

}
