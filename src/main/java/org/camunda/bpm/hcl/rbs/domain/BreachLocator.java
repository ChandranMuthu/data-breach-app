package org.camunda.bpm.hcl.rbs.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_breach_locator")
public class BreachLocator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "breach_locator_id")
	Long breachLocatorId;
	private String franchise;
	private String businessArea;
	private String accountRegions;
	private transient List<String> accountRegion;

	public Long getBreachLocatorId() {
		return breachLocatorId;
	}
	public void setBreachLocatorId(Long breachLocatorId) {
		this.breachLocatorId = breachLocatorId;
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

	public String getAccountRegions() {
		return accountRegions;
	}
	public void setAccountRegions(String accountRegions) {
		this.accountRegions = accountRegions;
	}
	public List<String> getAccountRegion() {
		return accountRegion;
	}
	public void setAccountRegion(List<String> accountRegion) {
		this.accountRegion = accountRegion;
	}

}
