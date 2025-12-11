package com.learning.logging;

import org.apache.log4j.Logger;

public class AppUtils {

	private static final Logger LOG = Logger.getLogger(AppUtils.class);

	public static void show() {
		LOG.info("Hello World!");
		LOG.info("Welcome Back!");
	}

	public static void main(String[] args) {
		show();
	}
}
