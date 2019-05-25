package com.rfs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="RFS_Client_Details")
public class ClientDetailsRFS {

	/*
	Client_Id
	Name
	Description
	Creation date
	Updated_timestamp
	DEL_Flag
	Created By
	Logo
*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "client_id")
	private int clientId;
	
	@Column(name="descrp", nullable=false)
	private String descrp;
	
	@Column(name="name", nullable=false)
	private String name;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creationTime")
	private Date creationTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updatedTime")
	private Date updatedTime;

	@Column(name="logo", nullable=false)
	private String logo;

	
	@Column(name="del_flag")
	private String delFlag;
	
	@Column(name="created_by")
	private String createdBy;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getDescrp() {
		return descrp;
	}

	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	



	
	

}
