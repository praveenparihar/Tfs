package com.tfs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="FeedBack_Rating")
public class FeedBackRating {

	/*
	FeedBack_Id
	Rating_Parameter_id
	User_Rating

*/
	
	
	 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	/*@ManyToOne
	@JoinColumn(name = "FeedBack_Id", nullable =false)
	//@NotNull
	private FeedBackDetails feedBackDetails;*/
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "rating_parameter_id")
	@NotNull
	private RatingParameter ratingParameter;
	
	@Column(name="user_rating")
	private Double userRating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public FeedBackDetails getFeedBackDetails() {
		return feedBackDetails;
	}

	public void setFeedBackDetails(FeedBackDetails feedBackDetails) {
		this.feedBackDetails = feedBackDetails;
	}*/

	public RatingParameter getRatingParameter() {
		return ratingParameter;
	}

	public void setRatingParameter(RatingParameter ratingParameter) {
		this.ratingParameter = ratingParameter;
	}

	public Double getUserRating() {
		return userRating;
	}

	public void setUserRating(Double userRating) {
		this.userRating = userRating;
	}
	
}
