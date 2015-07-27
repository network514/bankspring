package com.bankspring.factory;

public class Command implements Orderable{
	public final int PAGESIZE = 10;
	int pageNo, start, end;
	String command, searchKey, searchVal; 
	
	public int getPageNo() {
		return pageNo;
	}



	public void setPageNo(String pageNo) {
		this.pageNo = Integer.parseInt(pageNo);
		this.start = (Integer.parseInt(pageNo)-1)*PAGESIZE+1;
		this.end = Integer.parseInt(pageNo)*PAGESIZE;
	}



	public int getStart() {
		return start;
	}



	public void setStart(int start) {
		this.start = start;
	}



	public int getEnd() {
		return end;
	}



	public void setEnd(int end) {
		this.end = end;
	}



	public String getCommand() {
		return command;
	}



	public void setCommand(String command) {
		this.command = command;
	}



	public String getSearchKey() {
		return searchKey;
	}



	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}



	public String getSearchVal() {
		return searchVal;
	}



	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(String pageNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(String searchKey, String searchVal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(String pageNo, String searchKey, String searchVal) {
		// TODO Auto-generated method stub
		
	}

}
