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
@Table(name="RFS_FeedBack_Details")
public class FeedBackDetailsRFS {

	/*
	FeedBack_Id
	Machine_id
	Created_timestamp
	Image
	Overall_Rating


*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "FeedBack_Id")
	private int feedBackId;
	
	
	@Column(name = "overall_rating")
	private Integer overAllRating ;
	
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_time")
	private Date createdTime;
	
	
	//@OneToMany(mappedBy="feedBackDetails")
	//@Cascade({CascadeType.ALL})
	//@NotNull
	@OneToMany(fetch=FetchType.EAGER,targetEntity=FeedBackRatingRFS.class, cascade = CascadeType.ALL)
	//@OneToMany(fetch=FetchType.LAZY, mappedBy=FeedBackRating.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "FeedBack_Id", referencedColumnName="FeedBack_Id")
	private Set<FeedBackRatingRFS> feedBackRatings;
	
	
	@ManyToOne
	@JoinColumn(name = "selection_criteria_id")
	@NotNull
	private SelectionCriteria selectionCriteria;



	public int getFeedBackId() {
		return feedBackId; 
	}



	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}



	public Integer getOverAllRating() {
		return overAllRating;
	}



	public void setOverAllRating(Integer overAllRating) {
		this.overAllRating = overAllRating;
	}



	public Date getCreatedTime() {
		return createdTime;
	}



	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}



	

	public SelectionCriteria getSelectionCriteria() {
		return selectionCriteria;
	}



	public void setSelectionCriteria(SelectionCriteria selectionCriteria) {
		this.selectionCriteria = selectionCriteria;
	}



	//@OneToMany(mappedBy="feedBackDetails", cascade = CascadeType.ALL)
	//@Casad({CascadeType.ALL})
	public Set<FeedBackRatingRFS> getFeedBackRatings() {
		return feedBackRatings;
	}



	public void setFeedBackRatings(Set<FeedBackRatingRFS> feedBackRatings) {
		this.feedBackRatings = feedBackRatings;
	}
	
	

	
}
