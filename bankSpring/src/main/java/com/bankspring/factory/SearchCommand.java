package com.bankspring.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SearchCommand extends Command {
	private static final Logger logger = LoggerFactory.getLogger(SearchCommand.class);
	@Override
	public void execute(String searchKey, String searchVal) {
		setSearchKey(searchKey);
		setSearchVal(searchVal);
		logger.info("서치커맨드 검색키={},검색값={}",getSearchKey(),getSearchVal());
	}
	@Override
	public void execute(String pageNo, String searchKey, String searchVal) {
		setPageNo(pageNo);
		setSearchKey(searchKey);
		setSearchVal(searchVal);
		logger.info("서치커맨드 검색키={},검색값={}",getSearchKey(),getSearchVal());
	}
}
