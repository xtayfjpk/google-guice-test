package com.xtayfjpk.google.guice.test;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xtayfjpk.google.juice.module.CommentModule;
import com.xtayfjpk.google.juice.service.CommentService;


public class GuiceTest {
	
	@Test
	public void test() throws Exception {
		Injector injector = Guice.createInjector(new CommentModule());
		CommentService commentService = injector.getInstance(CommentService.class);
		commentService.comment();
	}
}
