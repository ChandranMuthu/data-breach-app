package org.camunda.bpm.hcl.rbs.request;

public class BreachInfoVO {
	private String breachStartTime;
	private String breachActualTime;
	private String breachAware;
	private String category;
	private boolean isDestroyRequested;
	private boolean isInformantionLost;
	private String issueReason;

	public String getBreachStartTime() {
		return breachStartTime;
	}
	public void setBreachStartTime(String breachStartTime) {
		this.breachStartTime = breachStartTime;
	}
	public String getBreachActualTime() {
		return breachActualTime;
	}
	public void setBreachActualTime(String breachActualTime) {
		this.breachActualTime = breachActualTime;
	}
	public String getBreachAware() {
		return breachAware;
	}
	public void setBreachAware(String breachAware) {
		this.breachAware = breachAware;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isDestroyRequested() {
		return isDestroyRequested;
	}
	public void setDestroyRequested(boolean isDestroyRequested) {
		this.isDestroyRequested = isDestroyRequested;
	}
	public boolean isInformantionLost() {
		return isInformantionLost;
	}
	public void setInformantionLost(boolean isInformantionLost) {
		this.isInformantionLost = isInformantionLost;
	}
	public String getIssueReason() {
		return issueReason;
	}
	public void setIssueReason(String issueReason) {
		this.issueReason = issueReason;
	}

}
