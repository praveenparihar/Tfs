package com.tfs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rating_Parameter_Master")
public class RatingParameter {

	/*
	 * ID Description Icon Remarks Max Rating Min Rating DEL_Flag
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rating_parameter_id")
	private int ratingParameterId;

	@Column(name = "descrp", nullable = false)
	private String descrp;

	@Column(name = "min", nullable = true)
	private Integer maxRating;

	@Column(name = "max", nullable = true)
	private Integer minRating;

	@Column(name = "del_flag", nullable = false)
	private String delFlag;

	@Column(name = "remarks", nullable = false)
	private String remarks;
	
	@Column(name = "icon", nullable = false)
	private String icon;
	
	@Column(name="name")
	private String name;
	
	
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRatingParameterId() {
		return ratingParameterId;
	}

	public void setRatingParameterId(int ratingParameterId) {
		this.ratingParameterId = ratingParameterId;
	}

	public String getDescrp() {
		return descrp;
	}

	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}

	public Integer getMaxRating() {
		return maxRating;
	}

	public void setMaxRating(Integer maxRating) {
		this.maxRating = maxRating;
	}

	public Integer getMinRating() {
		return minRating;
	}

	public void setMinRating(Integer minRating) {
		this.minRating = minRating;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	
}
