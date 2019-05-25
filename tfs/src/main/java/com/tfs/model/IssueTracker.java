package com.tfs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "issue_tracker")
public class IssueTracker {

	/*
	 * ID Issue_Reported_id Issue_Id
	 * 
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "issueTypeId", nullable = false)
	private MasterIssueList masterIssueList;

	
	@Column(name = "status")
	private Boolean status;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "Issue_Reported_id", nullable = false) private
	 * IssueDetails issueDetails;
	 */

	
	public int getId() {
		return id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MasterIssueList getMasterIssueList() {
		return masterIssueList;
	}

	public void setMasterIssueList(MasterIssueList masterIssueList) {
		this.masterIssueList = masterIssueList;
	}

	/*
	 * public IssueDetails getIssueDetails() { return issueDetails; }
	 * 
	 * public void setIssueDetails(IssueDetails issueDetails) {
	 * this.issueDetails = issueDetails; }
	 */

	/*
	 * public FeedBackDetails getFeedBackDetails() { return feedBackDetails; }
	 * 
	 * public void setFeedBackDetails(FeedBackDetails feedBackDetails) {
	 * this.feedBackDetails = feedBackDetails; }
	 */

}
