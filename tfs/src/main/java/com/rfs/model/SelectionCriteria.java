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
@Table(name="RFS_Selection_Criteria")
public class SelectionCriteria {

	/*
	selection_criteria_id	
Section_id	
meal_type	Lunch/Diner
meal_category	V/NV/Both
meal_ serve_type	Buffet/Al carte
creationTimeStamp	



*/	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "selection_criteria_id")
	private int selectionCriteriaId;
	
	@Column(name="meal_type", nullable=false)
	private String mealType;
	
	@Column(name="meal_category", nullable=false)
	private String mealCategory;
	
	@Column(name="meal_serve_type", nullable=false)
	private String mealServeType;
	
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Creation_timeStamp")
	private Date creationTime;
	
		
	@ManyToOne
	@JoinColumn(name = "Section_id")
	@NotNull
	private SectionDetailsRFS sectionDetails;


	public int getSelectionCriteriaId() {
		return selectionCriteriaId;
	}


	public void setSelectionCriteriaId(int selectionCriteriaId) {
		this.selectionCriteriaId = selectionCriteriaId;
	}


	public String getMealType() {
		return mealType;
	}


	public void setMealType(String mealType) {
		this.mealType = mealType;
	}


	public String getMealCategory() {
		return mealCategory;
	}


	public void setMealCategory(String mealCategory) {
		this.mealCategory = mealCategory;
	}


	public String getMealServeType() {
		return mealServeType;
	}


	public void setMealServeType(String mealServeType) {
		this.mealServeType = mealServeType;
	}


	public Date getCreationTime() {
		return creationTime;
	}


	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}


	public SectionDetailsRFS getSectionDetails() {
		return sectionDetails;
	}


	public void setSectionDetails(SectionDetailsRFS sectionDetails) {
		this.sectionDetails = sectionDetails;
	}

	
		
	
	
}
