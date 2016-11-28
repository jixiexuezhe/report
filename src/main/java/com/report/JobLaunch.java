package com.report;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobLaunch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext context = new ClassPathXmlApplicationContext("/springbatch/triggers.xml");
	}
}
