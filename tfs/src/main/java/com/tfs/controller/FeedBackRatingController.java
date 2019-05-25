package com.tfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.model.FeedBackRating;
import com.tfs.service.FeedBackRatingService;

@RestController
@RequestMapping("/feedBackRating")
public class FeedBackRatingController {

	@Autowired
	private FeedBackRatingService feedBackRatingService;

	@RequestMapping(value = "/getListFeedBackDetails", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<FeedBackRating> getListFeedBackDetails() {
		return feedBackRatingService.getListFeedBackRating();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody FeedBackRating add(@RequestBody FeedBackRating feedbackRating) {
		System.out.println("feedbackRating :: "+feedbackRating);
		feedbackRating.setRatingParameter(feedbackRating.getRatingParameter());
		feedbackRating.setUserRating(feedbackRating.getUserRating());
		feedBackRatingService.saveOrUpdate(feedbackRating);
		return feedbackRating;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody FeedBackRating update(@PathVariable("id") int id, @RequestBody FeedBackRating feedBackRating) {
		feedBackRating.setId(id);
		feedBackRatingService.saveOrUpdate(feedBackRating);
		return feedBackRating;
	}

}
