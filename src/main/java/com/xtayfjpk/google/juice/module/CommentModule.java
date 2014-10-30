package com.xtayfjpk.google.juice.module;

import com.google.inject.AbstractModule;
import com.xtayfjpk.google.juice.dao.CommentDao;
import com.xtayfjpk.google.juice.dao.CommentDaoImpl;
import com.xtayfjpk.google.juice.service.CommentService;
import com.xtayfjpk.google.juice.service.CommentServiceImpl;

public class CommentModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(CommentDao.class).to(CommentDaoImpl.class);
		this.bind(CommentService.class).to(CommentServiceImpl.class);
	}

}
