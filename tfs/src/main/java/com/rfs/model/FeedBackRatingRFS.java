package com.rfs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RFS_FeedBack_Rating")
public class FeedBackRatingRFS {

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
	
	
	@ManyToOne
	@JoinColumn(name = "rating_parameter_id")
	@NotNull
	private RatingParameterRFS ratingParameter;
	
	@Column(name="user_rating")
	private Integer userRating;

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

	public RatingParameterRFS getRatingParameter() {
		return ratingParameter;
	}

	public void setRatingParameter(RatingParameterRFS ratingParameter) {
		this.ratingParameter = ratingParameter;
	}

	public Integer getUserRating() {
		return userRating;
	}

	public void setUserRating(Integer userRating) {
		this.userRating = userRating;
	}
	
	

	
}
