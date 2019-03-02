package org.camunda.bpm.hcl.rbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_breach_reporter")
public class BreachReporter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "breach_locator_id")
	Long breachReporterId;
	private String identifier;
	private String fullName;
	private String supplier;
	private String reportedBy;
	private String companyName;
	private String contactDetails;

	public Long getBreachReporterId() {
		return breachReporterId;
	}
	public void setBreachReporterId(Long breachReporterId) {
		this.breachReporterId = breachReporterId;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}



}
