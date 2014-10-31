package com.xtayfjpk.google.juice.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.xtayfjpk.google.juice.dao.CommentDao;

public class CommentServiceImpl implements CommentService {
	@Inject
	private CommentDao commentDao;
	@Inject @Named("value")
	private String value;
	
	@Inject
	public CommentServiceImpl(@Named("value")String value) {
		this.value = value;
	}
	
	@Override
	public void comment() {
		System.out.println("comment method in service");
		commentDao.comment();
	}
	
	@Override
	public void comment2() {
		System.out.println("comment method in service, the value is " + value);
	}

}
