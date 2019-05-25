package com.tfs.model;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name = "Machine_Details")
public class MachineDetails {

	/*
	 * Machine_id Client_id Machine _name Location GenderLocation Install_time
	 * Status Restart_time Last_Clean_Time DEL_Flag
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "machine_id")
	private int machineId;

	@Column(name = "machine_name")
	private String machineName;

	@Column(name = "location")
	private String location;

	@Column(name = "gender_location")
	private String gender_location;

	@Column(name = "status")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "install_Time")
	private Date installTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "restart_Time")
	private Date restartTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_clean_time")
	private Date lastCleanTime;

	@Column(name = "del_flag", nullable = false)
	private String delFlag;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "client_id")
	@NotNull
	private ClientDetails clientDetails;

	public int getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender_location() {
		return gender_location;
	}

	public void setGender_location(String gender_location) {
		this.gender_location = gender_location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getInstallTime() {
		return installTime;
	}

	public void setInstallTime(Date installTime) {
		this.installTime = installTime;
	}

	public Date getRestartTime() {
		return restartTime;
	}

	public void setRestartTime(Date restartTime) {
		this.restartTime = restartTime;
	}

	public Date getLastCleanTime() {
		return lastCleanTime;
	}

	public void setLastCleanTime(Date lastCleanTime) {
		this.lastCleanTime = lastCleanTime;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

}
