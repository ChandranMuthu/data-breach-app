package org.camunda.bpm.hcl.rbs.domain;

public class BreachData {
private String franchise;
private String businessArea;
private String breachIdentifier;
private BreachReporter breachReporter;
private BreachInfo breachInfo;
private BreachLocator businessDomain;
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
