package com.rfs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RFS_Rating_Parameter_Master")
public class RatingParameterRFS {

	
	/*
	ID
	Description
	Icon
	Remarks
	Max Rating
	Min Rating
	DEL_Flag*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "rating_parameter_id")
	private int ratingParameterId;
	
	@Column(name="descrp", nullable=false)
	private String descrp;
	
	@Column(name="min", nullable=true)
	private Integer maxRating;
	
	@Column(name="max", nullable=true)
	private Integer minRating;
	
	
	@Column(name="del_flag")
	private String delFlag;

	
	
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
