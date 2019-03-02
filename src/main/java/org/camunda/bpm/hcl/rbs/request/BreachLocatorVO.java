package org.camunda.bpm.hcl.rbs.request;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class BreachLocatorVO {
	private String franchise;
	private String businessArea;
	private List<String> accountRegion;

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
	public List<String> getAccountRegion() {
		return accountRegion;
	}
	public void setAccountRegion(List<String> accountRegion) {
		this.accountRegion = accountRegion;
	}

}
