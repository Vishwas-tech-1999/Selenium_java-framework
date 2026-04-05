package com.utility;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;

public class LoggerUtility {

	private static LogManager logger;

	private LoggerUtility() {

	}

	public static LogManager getLogger(Class<?> clazz) {
		if (logger == null) {
			logger = LogManager.getLogManager();

		}
		return logger;
	}
}
