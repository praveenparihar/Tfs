package com.tfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.model.RatingParameter;
import com.tfs.service.RatingParameterService;

@RestController
@RequestMapping("/ratingParameter")
public class RatingParameterController {

	@Autowired
	RatingParameterService ratingParameterService;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List getListRatingParameter() {
		List ratingParameters = ratingParameterService.getListRatingParameter();

		return ratingParameters;
	}

	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public @ResponseBody RatingParameter add(@RequestBody RatingParameter ratingParameter) {
		ratingParameterService.saveOrUpdate(ratingParameter);

		return ratingParameter;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody RatingParameter update(@PathVariable("id") int id,
			@RequestBody RatingParameter ratingParameter) {
		ratingParameter.setRatingParameterId(id);
		ratingParameterService.saveOrUpdate(ratingParameter);

		return ratingParameter;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody RatingParameter delete(@PathVariable("id") int id) {
		RatingParameter ratingParameter = ratingParameterService.findRatingParameterById(id);
		ratingParameterService.deleteRatingParameter(id);

		return ratingParameter;
	}

}
