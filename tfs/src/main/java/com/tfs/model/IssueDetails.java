package com.tfs.model;

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


@Entity
@Table(name="Issue_Details")
public class IssueDetails {

	/*
	Issue_Reported_id
	Machine_Id
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
	
	
	
	@OneToMany(fetch= FetchType.EAGER, targetEntity = IssueTracker.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Issue_Reported_id", referencedColumnName = "Issue_Reported_id")
	//@OneToMany(mappedBy = "issueDetails", cascade = CascadeType.ALL)
	private Set<IssueTracker> issueTrackerSet ;
	
	@ManyToOne
	@JoinColumn(name = "machine_id")
	@NotNull
	private MachineDetails machineDetails;



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





	public Set<IssueTracker> getIssueTrackerSet() {
		return issueTrackerSet;
	}


	public void setIssueTrackerSet(Set<IssueTracker> issueTrackerSet) {
		this.issueTrackerSet = issueTrackerSet;
	}


	public MachineDetails getMachineDetails() {
		return machineDetails;
	}


	public void setMachineDetails(MachineDetails machineDetails) {
		this.machineDetails = machineDetails;
	}
	
}
