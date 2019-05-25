package com.rfs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RFS_Section_Details")
public class SectionDetailsRFS {

	/*
	Section_id
Client_id
Section _name
Location
Creation_timeStamp
DEL_Flag


*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "Section_id")
	private int sectionId;
	
	@Column(name="Section_name", nullable=false)
	private String sectionName;
	
	
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Creation_timeStamp")
	private Date creationTime;
	
		
	@Column(name="del_flag")
	private String delFlag;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	@NotNull
	private ClientDetailsRFS clientDetails;

	
	public ClientDetailsRFS getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetailsRFS clientDetails) {
		this.clientDetails = clientDetails;
	}

	

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
	
	
	
}
