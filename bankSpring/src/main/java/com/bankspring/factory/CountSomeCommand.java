package com.bankspring.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CountSomeCommand extends Command {
	private static final Logger logger = LoggerFactory.getLogger(CountSomeCommand.class);
	@Override
	public void execute(String searchKey, String searchVal) {
		setSearchKey(searchKey);
		setSearchVal(searchVal);
		logger.info("서치커맨드 검색키={}, 검색값={}", getSearchKey(),getSearchVal());
	}
}
