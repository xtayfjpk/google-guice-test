package com.xtayfjpk.google.juice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.xtayfjpk.google.juice.dao.CommentDao;
import com.xtayfjpk.google.juice.dao.CommentDaoImpl;
import com.xtayfjpk.google.juice.service.CommentService;
import com.xtayfjpk.google.juice.service.CommentServiceImpl;

public class CommentModule extends AbstractModule {

	@Override
	protected void configure() {
		//this.bind(CommentDao.class).to(CommentDaoImpl.class);
		this.bind(CommentService.class).to(CommentServiceImpl.class);
		this.bind(String.class).annotatedWith(Names.named("value")).toInstance("hello guice");
	}

	
	@Provides
	public CommentDao provideCommentDao() {
		return new CommentDaoImpl();
	}
}
