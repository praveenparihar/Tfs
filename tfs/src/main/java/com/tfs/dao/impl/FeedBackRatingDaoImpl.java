package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.FeedBackRatingDao;
import com.tfs.model.FeedBackRating;

@Repository
public class FeedBackRatingDaoImpl implements FeedBackRatingDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<FeedBackRating> getListFeedBackRating() {
		Criteria criteria = getSession().createCriteria(FeedBackRating.class);

		return (List<FeedBackRating>) criteria.list();
	}

	public void saveOrUpdate(FeedBackRating feedBackRating) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(feedBackRating);
		tx.commit();
		s.close();
	}

	public void deleteFeedBackDetails(int id) {
		FeedBackRating feedBackDetails = (FeedBackRating) getSession().get(FeedBackRating.class, id);
		getSession().delete(feedBackDetails);
	}

}