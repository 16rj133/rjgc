package com.zufe.util;


import java.util.ArrayList;
import java.util.List;

/**
 * 分页类，封装分页基本信息。
 */
public class Page {
	private int curPage = 1;
	private int totalPage;
	//数据库记录数
	private int rows;
	//每页数据
	private int pageNumber = 8;
	//要展示的List数据
	private List data = new ArrayList();
	
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	
}
