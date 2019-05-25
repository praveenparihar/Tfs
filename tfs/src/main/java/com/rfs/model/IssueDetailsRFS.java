package com.rfs.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name="RFS_Issue_Details")
public class IssueDetailsRFS {

	/*
	Issue_Reported_id
selection_criteria _id
Created_TimeStamp
Issue_Count
Status




*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "Issue_Reported_id")
	private int issueReportedId;
	
	
	@Column(name = "issue_Count")
	private Integer issueCount ;
	
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_time")
	private Date createdTime;
	
	
	
	@OneToMany(fetch= FetchType.EAGER, targetEntity = IssueTrackerRFS.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Issue_Reported_id", referencedColumnName = "Issue_Reported_id")
	//@OneToMany(mappedBy = "issueDetails", cascade = CascadeType.ALL)
	private Set<IssueTrackerRFS> issueTrackerSet ;
	
	@ManyToOne
	@JoinColumn(name = "selection_criteria_id")
	@NotNull
	private SelectionCriteria selectionCriteria;


	@Column(name = "status")
	private String status;


	public int getIssueReportedId() {
		return issueReportedId;
	}


	public void setIssueReportedId(int issueReportedId) {
		this.issueReportedId = issueReportedId;
	}


	public Integer getIssueCount() {
		return issueCount;
	}


	public void setIssueCount(Integer issueCount) {
		this.issueCount = issueCount;
	}


	public Date getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}





	public Set<IssueTrackerRFS> getIssueTrackerSet() {
		return issueTrackerSet;
	}


	public void setIssueTrackerSet(Set<IssueTrackerRFS> issueTrackerSet) {
		this.issueTrackerSet = issueTrackerSet;
	}


	


	public SelectionCriteria getSelectionCriteria() {
		return selectionCriteria;
	}


	public void setSelectionCriteria(SelectionCriteria selectionCriteria) {
		this.selectionCriteria = selectionCriteria;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

	
}
