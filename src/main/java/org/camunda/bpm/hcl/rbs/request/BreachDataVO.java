package org.camunda.bpm.hcl.rbs.request;

public class BreachDataVO {
	private String franchise;
	private String businessArea;
	private String breachIdentifier;
	private BreachReporterVO breachReporter;
	private BreachInfoVO breachInfo;
	private BreachLocatorVO businessDomain;
	private String issueCompromisedEntity;

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
	public String getIssueCompromisedEntity() {
		return issueCompromisedEntity;
	}
	public void setIssueCompromisedEntity(String issueCompromisedEntity) {
		this.issueCompromisedEntity = issueCompromisedEntity;
	}
	public BreachReporterVO getBreachReporter() {
		return breachReporter;
	}
	public void setBreachReporter(BreachReporterVO breachReporter) {
		this.breachReporter = breachReporter;
	}
	public BreachInfoVO getBreachInfo() {
		return breachInfo;
	}
	public void setBreachInfo(BreachInfoVO breachInfo) {
		this.breachInfo = breachInfo;
	}
	public BreachLocatorVO getBusinessDomain() {
		return businessDomain;
	}
	public void setBusinessDomain(BreachLocatorVO businessDomain) {
		this.businessDomain = businessDomain;
	}
}
