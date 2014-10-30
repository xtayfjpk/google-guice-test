package com.xtayfjpk.google.juice.service;

import com.google.inject.Inject;
import com.xtayfjpk.google.juice.dao.CommentDao;

public class CommentServiceImpl implements CommentService {
	@Inject
	private CommentDao commentDao;
	
	@Override
	public void comment() {
		System.out.println("comment method in service");
		commentDao.comment();
	}

}
